package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.gen.machineset.MachineSet;
import com.github.openshift.circe.gen.networkconfig.NetworkConfig;
import com.github.openshift.circe.gen.tuned.Tuned;
import com.github.openshift.circe.gen.tuned.TunedSpec;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.network.OnlineNetworkConfig;
import com.github.openshift.config.impl.tuning.OpsDefaultTunedSpec;

import java.util.Map;

/**
 * Base class for all online clusters (starter / pro)
 */
public abstract class OnlineTypeClusterDefinition extends BaseClusterDefinition{

    public OnlineTypeClusterDefinition(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
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
    public KubeList<MachineSet> getMachineSetList() {
        return null;
    }

    @Override
    public NetworkConfig getNetworkConfig() {
        return new OnlineNetworkConfig();
    }

}
