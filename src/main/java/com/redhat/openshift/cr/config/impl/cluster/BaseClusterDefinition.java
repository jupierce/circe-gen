package com.redhat.openshift.cr.config.impl.cluster;

import com.redhat.openshift.circe.gen.ClusterDefinition;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfig;
import com.redhat.openshift.cr.config.ClusterCriterion;
import com.redhat.openshift.cr.config.impl.network.BaseNetworkConfig;

import java.util.Map;

/**
 * Superclass for all operation's clusters.
 */
public abstract class BaseClusterDefinition implements ClusterDefinition {

    // Stores the ClusterType being rendered
    protected final ClusterCriterion.ClusterType clusterType;
    // Stores the ClusterEnvironment being rendered
    protected final ClusterCriterion.ClusterEnvironment clusterEnvironment;
    // Stores the cluster name being rendered
    protected final String clusterName;
    // Stores the map of attributes passed in from the command line
    protected final Map<String, String> evalAttributes;

    public BaseClusterDefinition(
            ClusterCriterion.ClusterType type,
            ClusterCriterion.ClusterEnvironment env,
            String name,
            Map<String, String> attributes) {
        this.clusterType = type;
        this.clusterEnvironment = env;
        this.clusterName = name;
        this.evalAttributes = attributes;
    }

    @Override
    public NetworkConfig getNetworkConfig() {
        return new BaseNetworkConfig();
    }

}
