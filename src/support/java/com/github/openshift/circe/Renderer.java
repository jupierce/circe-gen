package com.github.openshift.circe;

import com.github.openshift.circe.beans.ConfigUnit;
import com.github.openshift.circe.beans.RendererOrder;
import com.github.openshift.circe.gen.ConfigUnitType;
import com.github.openshift.circe.yaml.YamlDumper;
import com.github.openshift.circe.yaml.YamlPropertyIgnore;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;

public class Renderer {

    public static void toYamlDir(ConfigUnitType unit,  ConfigUnit def, Path outputDir) throws InvocationTargetException, IllegalAccessException, IOException {
        outputDir.toFile().mkdirs();
        for ( Method m : def.getClass().getMethods() ) {

            if ( m.getName().startsWith("get") && m.getDeclaringClass().getName().startsWith("java.") == false) {

                // The config unit can request that particular files not be rendered
                Annotation[] ignores = m.getAnnotationsByType(YamlPropertyIgnore.class);
                if ( ignores != null && ignores.length > 0 ) {
                    continue;
                }

                String objName = m.getName().substring(3); // string 'get'
                Object o = m.invoke(def);
                if ( o == null ) {
                    continue;
                }

                String filename = "";

                RendererOrder rfp = YamlDumper.getAnnotation(m, RendererOrder.class);
                if ( rfp != null ) {
                    filename += rfp.value() + "_";
                }

                filename += unit.name() + "_" + objName + ".yaml";

                Path yamlOutputFile = outputDir.resolve(filename);
                FileWriter jfw = new FileWriter(yamlOutputFile.toFile());
                jfw.write("# Serializing result of " + def.getClass() + "." + m.getName() + "\n");
                jfw.write((new YamlDumper(YamlDumper.Verbosity.SHOW_VALUE_SOURCE)).toString(o));
                jfw.close();
            }
        }
    }

}
