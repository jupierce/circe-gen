package com.redhat.openshift.cr.config;

import com.redhat.openshift.circe.gen.ClusterDefinition;
import com.redhat.openshift.circe.gen.machineset.MachineSet;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfig;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfigSpec;
import com.redhat.openshift.cr.config.network.StarterNetworkConfigSpec;

import java.util.Map;

@ClusterCriterion(
        type = ClusterCriterion.ClusterType.ONLINE_STARTER,
        env = ClusterCriterion.ClusterEnvironment.STG,
        name = "free-stg"
)
@ClusterCriterion(
        type = ClusterCriterion.ClusterType.ONLINE_STARTER,
        env = ClusterCriterion.ClusterEnvironment.INT
)
public class MyClusterDefinition implements ClusterDefinition {

    public MyClusterDefinition(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
    }

    @Override
    public MachineSet getMachineSet() {
        return null;
    }

    @Override
    public NetworkConfig getNetworkConfig() {
        return new NetworkConfig() {
            @Override
            public NetworkConfigSpec getSpec() {
                return new StarterNetworkConfigSpec();
            }
        };
    }

}
