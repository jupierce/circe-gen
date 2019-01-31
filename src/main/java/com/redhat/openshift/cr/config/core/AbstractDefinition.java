package com.redhat.openshift.cr.config.core;

import java.util.Map;

public abstract class AbstractDefinition {

    // Stores the ClusterType being rendered
    protected final ClusterCriterion.ClusterType clusterType;
    // Stores the ClusterEnvironment being rendered
    protected final ClusterCriterion.ClusterEnvironment clusterEnvironment;
    // Stores the cluster name being rendered
    protected final String clusterName;
    // Stores the map of attributes passed in from the command line
    protected final Map<String, String> evalAttributes;

    public AbstractDefinition(
            ClusterCriterion.ClusterType type,
            ClusterCriterion.ClusterEnvironment env,
            String name,
            Map<String, String> attributes) {
        this.clusterType = type;
        this.clusterEnvironment = env;
        this.clusterName = name;
        this.evalAttributes = attributes;
    }

}
