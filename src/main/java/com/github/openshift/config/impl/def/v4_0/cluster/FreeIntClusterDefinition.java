package com.github.openshift.config.impl.def.v4_0.cluster;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.gen.machineset.v1alpha1.MachineSet;
import com.github.openshift.circe.gen.tuned.v1alpha1.Tuned;
import com.github.openshift.circe.gen.tuned.v1alpha1.TunedSpec;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.tuned.v1alpha1.OpsDefaultTunedSpec;

/**
 * Base class for all "starter" type clusters.
 */
@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER, env = ClusterCriterion.ClusterEnvironment.INT, name="free-int")
public class FreeIntClusterDefinition extends OnlineStarterTypeClusterDefinition {

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
}
