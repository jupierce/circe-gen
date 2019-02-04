package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.beans.BeanList;
import com.github.openshift.circe.beans.ObjectMeta;
import com.github.openshift.circe.gen.machineset.*;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.tuning.OpsDefaultTunedSpec;
import com.github.openshift.circe.gen.tuned.Tuned;
import com.github.openshift.circe.gen.tuned.TunedSpec;

import java.util.List;
import java.util.Map;

/**
 * Base class for all "starter" type clusters.
 */
@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER, env = ClusterCriterion.ClusterEnvironment.INT, name="free-int")
public class FreeIntClusterDefinition extends OnlineStarterTypeClusterDefinition {

    public FreeIntClusterDefinition(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
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
        BeanList<MachineSet> sets = new BeanList<>();

        sets.add("infra",
                new MachineSet() {

                    @Override
                    public ObjectMeta getMetadata() throws Exception {
                        return new ObjectMeta(_getGeneratorNamespaceHint(), "infra");
                    }

                    @Override
                    public MachineSetSpec getSpec() throws Exception {
                        return new MachineSetSpec() {

                            @Override
                            public Long getReplicas() throws Exception {
                                return 3L;
                            }

                            @Override
                            public Long getMinReadySeconds() throws Exception {
                                return null;
                            }

                            @Override
                            public LabelSelector getSelector() throws Exception {
                                return null;
                            }

                            @Override
                            public MachineTemplateSpec getTemplate() throws Exception {
                                return new MachineTemplateSpec() {
                                    @Override
                                    public ObjectMeta getMetadata() throws Exception {
                                        return null;
                                    }

                                    @Override
                                    public MachineSpec getSpec() throws Exception {
                                        return new MachineSpec() {

                                            @Override
                                            public ObjectMeta getMetadata() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public List<Taint> getTaints() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public ProviderSpec getProviderSpec() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public MachineVersionInfo getVersions() throws Exception {
                                                return null;
                                            }

                                            @Override
                                            public NodeConfigSource getConfigSource() throws Exception {
                                                return null;
                                            }
                                        };
                                    }
                                };
                            }
                        };
                    }
                }
        );

        return sets;
    }

}
