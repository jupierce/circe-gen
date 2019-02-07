package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.gen.def.v4_0.ClusterDefinition;
import com.github.openshift.circe.gen.networkconfig.v1.NetworkConfig;
import com.github.openshift.config.impl.AbstractDefinition;
import com.github.openshift.config.impl.network.BaseNetworkConfig;

/**
 * Superclass for all operation's clusters.
 */
public abstract class BaseClusterDefinition extends AbstractDefinition implements ClusterDefinition {

    @Override
    public NetworkConfig getNetworkConfig() {
        return new BaseNetworkConfig();
    }

}
