package com.redhat.openshift.cr.config.impl.cluster;

import com.redhat.openshift.circe.gen.ClusterDefinition;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfig;
import com.redhat.openshift.cr.config.core.ClusterCriterion;
import com.redhat.openshift.cr.config.core.AbstractDefinition;
import com.redhat.openshift.cr.config.impl.network.BaseNetworkConfig;

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
