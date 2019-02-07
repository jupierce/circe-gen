package com.github.openshift.config.impl.def.v4_0.cluster;

import com.github.openshift.circe.gen.def.v4_0.ClusterDefinition;
import com.github.openshift.circe.gen.networkconfig.v1.NetworkConfig;
import com.github.openshift.config.impl.AbstractDefinition;
import com.github.openshift.config.impl.networkconfig.v1.BaseNetworkConfig;

/**
 * Superclass for all operation's clusters.
 */
public abstract class BaseClusterDefinition extends AbstractDefinition implements ClusterDefinition {

    @Override
    public NetworkConfig getNetworkConfig() {
        return new BaseNetworkConfig();
    }

}
