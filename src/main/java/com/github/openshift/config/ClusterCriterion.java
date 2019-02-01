package com.github.openshift.config;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(ClusterCriteria.class)
public @interface ClusterCriterion {

    String MATCH_ANY_CLUSTER_NAME = "*";

    ClusterType type();
    ClusterEnvironment env() default ClusterEnvironment.ANY;
    String name() default MATCH_ANY_CLUSTER_NAME;


    enum ClusterEnvironment {
        ANY("*"),
        INT("int"),
        STG("stg"),
        PROD("prod");

        public final String shortname;

        ClusterEnvironment(String shortname) {
            this.shortname = shortname;
        }

        public static ClusterEnvironment find(String name) throws IllegalArgumentException {
            for ( ClusterEnvironment e : ClusterEnvironment.values() ) {
                if ( e.shortname.equalsIgnoreCase(name.trim()) ) {
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

        public final String shortname;

        ClusterType(String shortname) {
            this.shortname = shortname;
        }

        public static ClusterType find(String name) throws IllegalArgumentException {
            for ( ClusterType e : ClusterType.values() ) {
                if ( e.shortname.equalsIgnoreCase(name.trim()) ) {
                    return e;
                }
            }
            throw new IllegalArgumentException("Unknown cluster type: '" + name + "'");
        }


    }

}
