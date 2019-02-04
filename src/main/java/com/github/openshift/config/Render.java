package com.github.openshift.config;

import com.github.openshift.circe.Renderer;
import com.github.openshift.config.impl.AbstractDefinition;
import com.github.openshift.circe.gen.ConfigUnitType;
import com.google.common.collect.Sets;
import org.reflections.Reflections;
import picocli.CommandLine;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.Callable;

import static com.github.openshift.config.ClusterCriterion.ClusterEnvironment.ANY;

@CommandLine.Command(name = "Render", mixinStandardHelpOptions = true, version = "1.0")
public class Render implements Callable<Void> {

    public static class ClusterTypeConverter extends ArrayList<String> implements CommandLine.ITypeConverter<ClusterCriterion.ClusterType> {
        public ClusterTypeConverter() {
            for ( ClusterCriterion.ClusterType ct : ClusterCriterion.ClusterType.values() ) {
                add(ct.shortname);
            }
        }
        public ClusterCriterion.ClusterType convert(String s) throws Exception {
            return ClusterCriterion.ClusterType.find(s);
        }
    }

    public static class ClusterEnvironmentConverter extends ArrayList<String> implements CommandLine.ITypeConverter<ClusterCriterion.ClusterEnvironment> {
        public ClusterEnvironmentConverter() {
            for ( ClusterCriterion.ClusterEnvironment ct : ClusterCriterion.ClusterEnvironment.values() ) {
                if ( ct == ANY ) { // user must specify an environment
                    continue;
                }
                add(ct.shortname);
            }
        }
        public ClusterCriterion.ClusterEnvironment convert(String s) throws Exception {
            return ClusterCriterion.ClusterEnvironment.find(s);
        }
    }

    @CommandLine.Option(names={"-u", "--unit"}, required = true, description="Configuration unit to render (${COMPLETION-CANDIDATES})", split="," )
    protected List<ConfigUnitType> units;


    @CommandLine.Option(names={"-t", "--type"}, required = true, description="The type of the cluster (e.g. ${COMPLETION-CANDIDATES})",
            converter = ClusterTypeConverter.class,
            completionCandidates = ClusterTypeConverter.class)
    protected ClusterCriterion.ClusterType targetType;


    @CommandLine.Option(names={"-e", "--environment"}, required = true, description="The environment of the cluster (${COMPLETION-CANDIDATES})",
            converter = ClusterEnvironmentConverter.class,
            completionCandidates = ClusterEnvironmentConverter.class)
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


        if ( attributes == null ) {
            attributes = new HashMap<>();
        }

        for ( ConfigUnitType unit : units ) {

            System.out.println("Searching for " + unit + " implementation most closely matching type[" + targetType + "] env[" + targetEnv + "] name[" + targetName + "]");

            HashMap<ClusterCriterion.ClusterType,Class<? extends AbstractDefinition>> byType = new HashMap<>();
            HashMap<String,Class<? extends AbstractDefinition>> byEnv = new HashMap<>();
            HashMap<String,Class<? extends AbstractDefinition>> byName = new HashMap<>();

            // Find all classes annotated with @ClusterCriterion
            Reflections reflections = new Reflections();
            for ( Class c : Sets.union(reflections.getTypesAnnotatedWith(ClusterCriteria.class), reflections.getTypesAnnotatedWith(ClusterCriterion.class)) ) {

                verbose("Assessing candidate: " + c);

                if ( Modifier.isAbstract(c.getModifiers()) ) {
                    verbose("   Skipping candidate because it is abstract class");
                    continue;
                }

                if ( unit.mustImplementClass.isAssignableFrom(c) == false ) {
                    verbose("   Skipping candidate because it does not implement unit interface: " + unit.mustImplementClass);
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

                    if ( ci.env() != ANY) {
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
                        System.out.println("No matching implementations found!");
                        System.exit(ignoreNotFound?0:1);
                    }
                }
            }

            Constructor constructor = lookup.getConstructor(ClusterCriterion.ClusterType.class, ClusterCriterion.ClusterEnvironment.class, String.class, Map.class);
            AbstractDefinition def = (AbstractDefinition)constructor.newInstance(this.targetType, this.targetEnv, this.targetName, attributes);

            System.out.println("Matched " + unit.name() + " definition: " + def.getClass().getName());
            System.out.println("Output directory: " + outputDir.toAbsolutePath());
            System.out.print("Rendering...");
            Renderer.toYamlDir(unit, def, outputDir);
            System.out.println("Done.");
        }

        return null;
    }


    public static void main(String[] args) {
        CommandLine.call(new Render(), args);
    }
}
