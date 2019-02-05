package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.gen.def.v4_0.ClusterDefinition;
import com.github.openshift.circe.gen.networkconfig.v1.NetworkConfig;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.AbstractDefinition;
import com.github.openshift.config.impl.network.BaseNetworkConfig;

import java.util.Map;

/**
 * Superclass for all operation's clusters.
 */
public abstract class BaseClusterDefinition extends AbstractDefinition implements ClusterDefinition {

    public BaseClusterDefinition(
            ClusterCriterion.ClusterType type,
            ClusterCriterion.ClusterEnvironment env,
            String name,
            Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public NetworkConfig getNetworkConfig() {
        return new BaseNetworkConfig();
    }

}
