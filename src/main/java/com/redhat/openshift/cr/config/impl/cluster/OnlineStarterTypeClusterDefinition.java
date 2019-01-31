package com.redhat.openshift.cr.config.impl.cluster;

import com.redhat.openshift.circe.gen.machineset.MachineSet;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfig;
import com.redhat.openshift.circe.gen.project.Project;
import com.redhat.openshift.circe.gen.project.ProjectSpec;
import com.redhat.openshift.circe.gen.project.TemplateReference;
import com.redhat.openshift.circe.gen.tuned.Tuned;
import com.redhat.openshift.circe.gen.tuned.TunedSpec;
import com.redhat.openshift.cr.config.core.ClusterCriterion;
import com.redhat.openshift.cr.config.impl.network.OnlineNetworkConfig;
import com.redhat.openshift.cr.config.impl.tuning.OpsDefaultTunedSpec;

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
    public MachineSet getMachineSet() {
        return null;
    }

    @Override
    public final NetworkConfig getNetworkConfig() {
        return new OnlineNetworkConfig();
    }

}
