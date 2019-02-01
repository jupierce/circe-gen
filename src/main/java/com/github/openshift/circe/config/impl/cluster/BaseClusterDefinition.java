package com.github.openshift.circe.config.impl.cluster;

import com.github.openshift.circe.config.core.AbstractDefinition;
import com.github.openshift.circe.config.core.ClusterCriterion;
import com.github.openshift.circe.config.impl.network.BaseNetworkConfig;
import com.github.openshift.circe.gen.ClusterDefinition;
import com.github.openshift.circe.gen.networkconfig.NetworkConfig;

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
