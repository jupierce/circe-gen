package com.github.openshift.circe.config.core;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(ClusterCriteria.class)
public @interface ClusterCriterion {

    String MATCH_ANY_CLUSTER_NAME = "*";

    ClusterType type();
    ClusterEnvironment env() default ClusterEnvironment.ANY_ENVIRONMENT;
    String name() default MATCH_ANY_CLUSTER_NAME;


    enum ClusterEnvironment {
        ANY_ENVIRONMENT("*"),
        INT("int"),
        STG("stg"),
        PROD("prod");

        private final String match;

        ClusterEnvironment(String match) {
            this.match = match;
        }

        public static ClusterEnvironment find(String name) throws IllegalArgumentException {
            for ( ClusterEnvironment e : ClusterEnvironment.values() ) {
                if ( e.match.equalsIgnoreCase(name.trim()) ) {
                    return e;
                }
            }
            throw new IllegalArgumentException("Unknown cluster environment: '" + name + "'");
        }
    }

    enum ClusterType {
        ONLINE_STARTER("starter"),
        ONLINE_PRO("pro"),
        DEDICATED("dedicated"),
        TEST("test");

        private final String match;

        ClusterType(String match) {
            this.match = match;
        }

        public static ClusterType find(String name) throws IllegalArgumentException {
            for ( ClusterType e : ClusterType.values() ) {
                if ( e.match.equalsIgnoreCase(name.trim()) ) {
                    return e;
                }
            }
            throw new IllegalArgumentException("Unknown cluster type: '" + name + "'");
        }


    }

}
