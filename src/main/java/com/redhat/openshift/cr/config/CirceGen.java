package com.redhat.openshift.cr.config;

import com.google.common.collect.Sets;
import com.redhat.openshift.circe.gen.ClusterDefinition;
import org.reflections.Reflections;
import picocli.CommandLine;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.concurrent.Callable;

import static com.redhat.openshift.cr.config.ClusterCriterion.ClusterEnvironment.ANY_ENVIRONMENT;

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


    @CommandLine.Option(names={"-t", "--type"}, required = true, description="The type of the cluster (e.g. starter/dedicated/etc)",
            converter = ClusterTypeConverter.class)
    public ClusterCriterion.ClusterType targetType;


    @CommandLine.Option(names={"-e", "--environment"}, required = true, description="The environment of the cluster (int/stg/prod)",
            converter = ClusterEnvironmentConverter.class)
    public ClusterCriterion.ClusterEnvironment targetEnv;

    @CommandLine.Option(names={"-n", "--name"}, required = true, description="The name of the cluster (e.g. free-stg/starter-us-east-1)"
    )
    public String targetName;


    @CommandLine.Option(names={"-p"}, description="Zero or more parameters to pass to the generator implementation" )
    public Map<String,String> attributes;


    /**
     * Entrypoint after CLI parsing
     */
    @Override
    public Void call() throws Exception {

        HashMap<ClusterCriterion.ClusterType,Class<? extends ClusterDefinition>> byType = new HashMap<>();
        HashMap<String,Class<? extends ClusterDefinition>> byEnv = new HashMap<>();
        HashMap<String,Class<? extends ClusterDefinition>> byName = new HashMap<>();

        if ( attributes == null ) {
            attributes = new HashMap<>();
        }

        // Find all classes annotated with @ClusterCriterion
        Reflections reflections = new Reflections(this.getClass().getPackage().getName());
        for ( Class c : Sets.union(reflections.getTypesAnnotatedWith(ClusterCriteria.class), reflections.getTypesAnnotatedWith(ClusterCriterion.class)) ) {
            Annotation[] info = c.getAnnotationsByType(ClusterCriterion.class);
            for ( Annotation a : info ) {
                ClusterCriterion ci = (ClusterCriterion)a;

                ClusterCriterion.ClusterType type = ci.type();

                if ( ! ci.name().equalsIgnoreCase(ClusterCriterion.MATCH_ANY_CLUSTER_NAME ) ) {
                    Class<? extends ClusterDefinition> old = byName.put(ci.name(), (Class<? extends ClusterDefinition>)c);
                    if ( old != null ) {
                        throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster: " + ci.name());
                    }
                    // If cluster definition is registered by name, don't register it by env or type
                    continue;
                }

                if ( ci.env() != ANY_ENVIRONMENT) {
                    String qualifiedEnv = type.toString() + ":" + ci.env();
                    Class<? extends ClusterDefinition> old = byEnv.put(qualifiedEnv, (Class<? extends ClusterDefinition>)c);
                    if ( old != null ) {
                        throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster environment: " + qualifiedEnv);
                    }
                    // If cluster definition is registered by env, don't register it by type
                    continue;
                }

                Class<? extends ClusterDefinition> old = byType.put(ci.type(), (Class<? extends ClusterDefinition>)c);
                if ( old != null ) {
                    throw new IOException("Invalid class hierarchy: Both " + c.getName() + " and " + old.getName() + " claim to be for cluster type: " + ci.type());
                }

            }

        }

        System.out.println("Found " + (byName.size() + byEnv.size() + byType.size()) + " definitions");

        Class<? extends ClusterDefinition> lookup = byName.get(this.targetName);
        if ( lookup == null ) {
            System.err.println("No hits when looking up by name: " + this.targetName );
            String qualifiedEnv = this.targetType + ":" + this.targetEnv;
            lookup = byEnv.get(qualifiedEnv);
            if ( lookup == null ) {
                System.err.println("No hits when looking up by qualified env: " + qualifiedEnv );
                lookup = byType.get(this.targetType);
                if ( lookup == null ) {
                    System.err.println("No hits when looking up by cluster type: " + this.targetType );
                    System.err.println("No hits at any hierarchy level! Exiting with an error.");
                    System.exit(1);
                }
            }
        }

        Constructor construtor = lookup.getConstructor(ClusterCriterion.ClusterType.class, ClusterCriterion.ClusterEnvironment.class, String.class, Map.class);
        ClusterDefinition cd = (ClusterDefinition)construtor.newInstance(this.targetType, this.targetEnv, this.targetName, attributes);

        System.out.println("Found a cluster definition: " + cd.getClass().getName());

        return null;
    }

    public static void main(String[] args) {
        // mvn install assembly:assembly
        // java -cp target/operator0-java-gen-1.0-SNAPSHOT-jar-with-dependencies.jar com.redhat.openshift.cr.config.CirceGen -e stg -n free-stg -t starter

        CommandLine.call(new CirceGen(), args);

        /*
        JSONObject jo = new JSONObject(new MyClusterDefinition());
        System.out.println(jo.toString(2));
        */

    }
}
