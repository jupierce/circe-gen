package com.github.openshift.circe;

import com.github.openshift.circe.beans.Definition;
import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.gen.DefinitionType;
import com.github.openshift.circe.yaml.*;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.*;

import static java.awt.SystemColor.info;

public class Renderer {

    public static class BeanInfo {
        public final DefinitionType unit;
        public final String objName;
        public final Bean bean;
        public final Definition source;
        public final Method fromMethod;
        public final String renderOrderHint;
        public final String fullSortKey;

        public BeanInfo(DefinitionType unit, Definition def, Method method, String objName, Bean bean, String renderOrderHint) {
            this.unit = unit;
            this.objName = objName;
            this.source = def;
            this.fromMethod = method;
            this.bean = bean;
            this.renderOrderHint = renderOrderHint;

            String key = "";
            if ( renderOrderHint != null ) {
                key += renderOrderHint + "_";
            }

            key += unit.name() + "_" + objName;
            this.fullSortKey = key;
        }
    }


    public interface BeanHandler {
        /**
         * @param info Information about a bean returned by the definition.
         *             info.bean field may be null if definition returns null in getter.
         */
        void handle(BeanInfo info) throws Exception;
    }

    /**
     * Explores a definition and notifies an interface each time a Bean is encountered.
     * @param unit The definition type to follow.
     * @param def The definition from which to extract beans.
     * @param handler Implementation to call with each bean discovered
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws IOException
     */
    public static void visitBeans(DefinitionType unit, Definition def, BeanHandler handler) throws Exception {
        HashMap<String, Bean> beans = new HashMap<>();

        for ( Method m : unit.mustImplementClass.getMethods() ) {

            if ( m.getName().startsWith("get") && m.getDeclaringClass().getName().startsWith("java.") == false) {

                // The config unit can request that particular files not be rendered
                Annotation[] ignores = m.getAnnotationsByType(YamlPropertyIgnore.class);
                if ( ignores != null && ignores.length > 0 ) {
                    continue;
                }

                String objName = m.getName().substring(3); // string 'get'
                Bean bean = (Bean)m.invoke(def);

                RenderOrder rfp = BeanAnalyzer.getAnnotation(m, RenderOrder.class);
                String renderOrderHint = null;
                if ( rfp != null ) {
                    renderOrderHint = rfp.value();
                }
                BeanInfo info = new BeanInfo(unit, def, m, objName, bean, renderOrderHint);
                handler.handle(info);
            }
        }
    }

    private static List<BeanInfo> getOrderedBeans(DefinitionType unit, Definition def) throws Exception {
        List<BeanInfo> beans = new ArrayList<>();

        visitBeans(unit, def, new BeanHandler() {
            @Override
            public void handle(BeanInfo info) throws Exception {
                if ( info.bean == null ) {
                    return;
                }
                if ( info.bean instanceof KubeList ) {
                    int count = 1;
                    for ( Bean b : ((KubeList<Bean>)info.bean).getItems() ) {
                        beans.add(new BeanInfo(
                                unit, def, info.fromMethod, info.objName + "Entry", b, info.renderOrderHint + String.format("_%04d", count)
                        ));
                        count++;
                    }
                } else {
                    beans.add(info);
                }
            }
        });

        // The above loop does not insert into the list in any particular order. We need to sort
        // by the sort key now.

        Collections.sort(beans, new Comparator<BeanInfo>() {
            @Override
            public int compare(BeanInfo beanInfo, BeanInfo t1) {
                return beanInfo.fullSortKey.compareTo(t1.fullSortKey);
            }
        });

        return beans;
    }

    public static void toYamlDir(DefinitionType unit, Definition def, Path baseDir, boolean serializeSecrets) throws Exception {
        YamlDumper dumper = new YamlDumper(YamlDumper.Verbosity.SHOW_VALUE_SOURCE);
        Path outputDir = baseDir.resolve(unit.unitName);
        outputDir.toFile().mkdirs();
        for (BeanInfo info : getOrderedBeans(unit, def)) {
            String filename = info.fullSortKey + ".yaml";
            Bean bean = info.bean;
            String yaml = dumper.toString(bean);

            if ( serializeSecrets == false && yaml.contains("kind: Secret")) {
                System.err.println("Skipping serialization of secret to disk");
                continue;
            }

            Path yamlOutputFile = outputDir.resolve(filename);
            FileWriter jfw = new FileWriter(yamlOutputFile.toFile());
            jfw.write("# Serializing result of " + def.getClass() + "." + info.fromMethod.getName() + "\n");
            jfw.write(yaml);
            jfw.close();
        }
    }

    public static KubeList<Bean> toKubeList(DefinitionType unit, Definition def) throws Exception {
        ArrayList<Bean> beans = new ArrayList<>();
        for (BeanInfo info : getOrderedBeans(unit, def)) {
            if (info.bean instanceof KubeList) {
                beans.addAll(((KubeList<Bean>)info.bean).getItems());
            } else {
                beans.add(info.bean);
            }
        }
        return new KubeList<>(beans);
    }

    public static String toKubeListString(DefinitionType unit, Definition def) throws Exception {
        YamlDumper dumper = new YamlDumper(YamlDumper.Verbosity.SHOW_VALUE_SOURCE);
        KubeList<Bean> list = toKubeList(unit, def);
        String yaml = dumper.toString(list);
        return "# Serializing result of " + def.getClass() + "\n" + yaml;
    }

}
