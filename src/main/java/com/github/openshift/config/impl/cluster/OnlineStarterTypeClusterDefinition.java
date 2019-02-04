package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.beans.BeanList;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.network.OnlineNetworkConfig;
import com.github.openshift.config.impl.tuning.OpsDefaultTunedSpec;
import com.github.openshift.circe.gen.machineset.MachineSet;
import com.github.openshift.circe.gen.networkconfig.NetworkConfig;
import com.github.openshift.circe.gen.tuned.Tuned;
import com.github.openshift.circe.gen.tuned.TunedSpec;

import java.util.Map;

/**
 * Base class for all "starter" type clusters.
 */
@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER)
public class OnlineStarterTypeClusterDefinition extends OnlineTypeClusterDefinition {

    public OnlineStarterTypeClusterDefinition(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public Tuned getTuned() {
        return new Tuned() {
            @Override
            public TunedSpec getSpec() {
                return new OpsDefaultTunedSpec();
            }
        };
    }

    @Override
    public BeanList<MachineSet> getMachineSet() {
        return null;
    }

    @Override
    public final NetworkConfig getNetworkConfig() {
        return new OnlineNetworkConfig();
    }

}
