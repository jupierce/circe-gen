package com.redhat.openshift.cr.config;

import com.redhat.openshift.circe.gen.ClusterDefinition;
import com.redhat.openshift.circe.gen.machineset.MachineSet;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfig;
import com.redhat.openshift.circe.gen.networkconfig.NetworkConfigSpec;
import com.redhat.openshift.circe.gen.project.Project;
import com.redhat.openshift.circe.gen.project.ProjectSpec;
import com.redhat.openshift.circe.gen.project.TemplateReference;
import com.redhat.openshift.circe.gen.tuned.Tuned;
import com.redhat.openshift.circe.gen.tuned.TunedSpec;
import com.redhat.openshift.cr.config.network.StarterNetworkConfigSpec;
import com.redhat.openshift.cr.config.tuning.OpsDefaultTunedSpec;

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
    public Project getProject() {
        return new Project() {
            @Override
            public ProjectSpec getSpec() {
                return new ProjectSpec() {
                    @Override
                    public String getProjectRequestMessage() {
                        return null;
                    }

                    @Override
                    public TemplateReference getProjectRequestTemplate() {
                        return new TemplateReference() {
                            @Override
                            public String getName() {
                                return "openshift-config/default-project-request";
                            }
                        };
                    }
                };
            }
        };
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
