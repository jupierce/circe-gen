package com.redhat.openshift.cr.config;

import com.google.common.collect.Sets;
import com.redhat.openshift.circe.gen.AuthDefinition;
import com.redhat.openshift.circe.gen.ClusterDefinition;
import com.redhat.openshift.circe.gen.ProjectDefinition;
import com.redhat.openshift.circe.yaml.TestClasses;
import com.redhat.openshift.circe.yaml.YamlDumper;
import com.redhat.openshift.cr.config.core.AbstractDefinition;
import com.redhat.openshift.cr.config.core.ClusterCriteria;
import com.redhat.openshift.cr.config.core.ClusterCriterion;
import org.reflections.Reflections;
import picocli.CommandLine;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static com.redhat.openshift.cr.config.core.ClusterCriterion.ClusterEnvironment.ANY_ENVIRONMENT;
import static sun.awt.FontConfiguration.verbose;

@CommandLine.Command(name = "CirceGen", mixinStandardHelpOptions = true, version = "1.0")
public class CirceGen implements Callable<Void> {

    public static class ClusterTypeConverter implements CommandLine.ITypeConverter<ClusterCriterion.ClusterType> {
        public ClusterCriterion.ClusterType convert(String s) throws Exception {
            return ClusterCriterion.ClusterType.find(s);
        }
    }

    public static class ClusterEnvironmentConverter implements CommandLine.ITypeConverter<ClusterCriterion.ClusterEnvironment> {
        public ClusterCriterion.ClusterEnvironment convert(String s) throws Exception {
            return ClusterCriterion.ClusterEnvironment.find(s);
        }
    }

    public enum Unit {
        project(ProjectDefinition.class),
        cluster(ClusterDefinition.class),
        auth(AuthDefinition.class),
        ;

        Unit(Class mustImplClass) {
            this.mustImplClass = mustImplClass;
        }

        private Class mustImplClass;
    }

    @CommandLine.Option(names={"-u", "--unit"}, required = true, description="Configuration unit to render")
    protected List<Unit> units;


    @CommandLine.Option(names={"-t", "--type"}, required = true, description="The type of the cluster (e.g. starter/dedicated/etc)",
            converter = ClusterTypeConverter.class)
    protected ClusterCriterion.ClusterType targetType;


    @CommandLine.Option(names={"-e", "--environment"}, required = true, description="The environment of the cluster (int/stg/prod)",
            converter = ClusterEnvironmentConverter.class)
    protected ClusterCriterion.ClusterEnvironment targetEnv;

    @CommandLine.Option(names={"-n", "--name"}, required = true, description="The name of the cluster (e.g. free-stg/starter-us-east-1)"
    )
    protected String targetName;


    @CommandLine.Option(names={"-p"}, description="Zero or more parameters to pass to the generator implementation" )
    protected Map<String,String> attributes;

    @CommandLine.Option(names={"-o", "--output"}, required = true)
    protected Path outputDir;

    @CommandLine.Option(names={"-v", "--verbose"}, required = false, defaultValue = "false", description = "Enable verbose output")
    protected boolean verbose;

    @CommandLine.Option(names={"--ignore-not-found"}, required = false, defaultValue = "false", description = "If no class implementing this unit is found, don't raise an error")
    protected boolean ignoreNotFound;

    public void verbose(String msg) {
        if (this.verbose) {
            System.out.println(msg);
        }
    }

    /**
     * Entrypoint after CLI parsing
     */
    @Override
    public Void call() throws Exception {

        HashMap<ClusterCriterion.ClusterType,Class<? extends AbstractDefinition>> byType = new HashMap<>();
        HashMap<String,Class<? extends AbstractDefinition>> byEnv = new HashMap<>();
        HashMap<String,Class<? extends AbstractDefinition>> byName = new HashMap<>();

        if ( attributes == null ) {
            attributes = new HashMap<>();
        }

        for ( Unit unit : units ) {

            // Find all classes annotated with @ClusterCriterion
            Reflections reflections = new Reflections();
            for ( Class c : Sets.union(reflections.getTypesAnnotatedWith(ClusterCriteria.class), reflections.getTypesAnnotatedWith(ClusterCriterion.class)) ) {

                verbose("Assessing candidate: " + c);

                if ( Modifier.isAbstract(c.getModifiers()) ) {
                    verbose("   Skipping candidate because it is abstract class");
                    continue;
                }

                if ( unit.mustImplClass.isAssignableFrom(c) == false ) {
                    verbose("   Skipping candidate because it does not implement unit interface: " + unit.mustImplClass);
                    continue;
                }


                verbose("   Registering candidate: " + c);

                Annotation[] info = c.getAnnotationsByType(ClusterCriterion.class);
                for ( Annotation a : info ) {
                    ClusterCriterion ci = (ClusterCriterion)a;

                    ClusterCriterion.ClusterType type = ci.type();

                    if ( ! ci.name().equalsIgnoreCase(ClusterCriterion.MATCH_ANY_CLUSTER_NAME ) ) {
                        Class<? extends AbstractDefinition> old = byName.put(ci.name(), (Class<? extends AbstractDefinition>)c);
                        if ( old != null ) {
                            throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster: " + ci.name());
                        }
                        // If cluster definition is registered by name, don't register it by env or type
                        continue;
                    }

                    if ( ci.env() != ANY_ENVIRONMENT) {
                        String qualifiedEnv = type.toString() + ":" + ci.env();
                        Class<? extends AbstractDefinition> old = byEnv.put(qualifiedEnv, (Class<? extends AbstractDefinition>)c);
                        if ( old != null ) {
                            throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster environment: " + qualifiedEnv);
                        }
                        // If cluster definition is registered by env, don't register it by type
                        continue;
                    }

                    Class<? extends AbstractDefinition> old = byType.put(ci.type(), (Class<? extends AbstractDefinition>)c);
                    if ( old != null ) {
                        throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster type: " + ci.type());
                    }

                }

            }

            verbose("Found " + (byName.size() + byEnv.size() + byType.size()) + " candidate unit implementations");

            Class<? extends AbstractDefinition> lookup = byName.get(this.targetName);
            if ( lookup == null ) {
                verbose("No hits when looking up by name: " + this.targetName );
                String qualifiedEnv = this.targetType + ":" + this.targetEnv;
                lookup = byEnv.get(qualifiedEnv);
                if ( lookup == null ) {
                    verbose("No hits when looking up by qualified env: " + qualifiedEnv );
                    lookup = byType.get(this.targetType);
                    if ( lookup == null ) {
                        verbose("No hits when looking up by cluster type: " + this.targetType );
                        System.exit(ignoreNotFound?0:1);
                    }
                }
            }

            Constructor constructor = lookup.getConstructor(ClusterCriterion.ClusterType.class, ClusterCriterion.ClusterEnvironment.class, String.class, Map.class);
            AbstractDefinition def = (AbstractDefinition)constructor.newInstance(this.targetType, this.targetEnv, this.targetName, attributes);

            System.out.println("Rendering a " + unit.name() + " definition: " + def.getClass().getName());
            System.out.println("Output directory: " + outputDir.toAbsolutePath());


            outputDir.toFile().mkdirs();
            for ( Method m : def.getClass().getMethods() ) {

                if ( m.getName().startsWith("get") && m.getDeclaringClass().getName().startsWith("java.") == false) {
                    String objName = m.getName().substring(3); // string 'get'
                    Object o = m.invoke(def);
                    if ( o == null ) {
                        continue;
                    }
                    Path yamlOutputFile = outputDir.resolve(objName + ".yml");
                    FileWriter jfw = new FileWriter(yamlOutputFile.toFile());
                    verbose("Writing " + yamlOutputFile.toAbsolutePath() );
                    jfw.write("# Serializing result of " + def.getClass() + "." + m.getName() + "\n");
                    jfw.write((new YamlDumper(YamlDumper.Verbosity.SHOW_VALUE_SOURCE)).toString(o));
                    jfw.close();
                }
            }

        }

        return null;
    }


    public static void main(String[] args) {

        //System.out.println((new YamlDumper()).toString(new TestClasses.X()));

        // mvn install assembly:assembly
        // java -cp target/operator0-java-gen-1.0-SNAPSHOT-jar-with-dependencies.jar com.redhat.openshift.cr.config.CirceGen -e stg -n free-stg -t starter

        CommandLine.call(new CirceGen(), args);

        /*
        JSONObject jo = new JSONObject(new OnlineStarterTypeClusterDefinition());
        System.out.println(jo.toString(2));
        */

    }
}
