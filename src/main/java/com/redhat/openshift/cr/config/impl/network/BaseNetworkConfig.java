package com.redhat.openshift.cr.config.impl.network;


import com.redhat.openshift.circe.gen.networkconfig.*;

import java.util.List;
import java.util.Map;

public class BaseNetworkConfig implements NetworkConfig {

    @Override
    public NetworkConfigSpec getSpec() {
        return new NetworkConfigSpec() {
            @Override
            public List<ClusterNetwork> getClusterNetworks() {
                return null;
            }

            @Override
            public String getServiceNetwork() {
                return null;
            }

            @Override
            public DefaultNetworkDefinition getDefaultNetwork() {
                return new DefaultNetworkDefinition() {
                    @Override
                    public String getType() {
                        return null;
                    }

                    @Override
                    public OpenShiftSDNConfig getOpenShiftSDNConfig() {
                        return new OpenShiftSDNConfig() {
                            @Override
                            public String getMode() {
                                return "Multitenant";
                            }

                            @Override
                            public Long getVXLANPort() {
                                return null;
                            }

                            @Override
                            public Long getMTU() {
                                return new Long(5);
                            }

                            @Override
                            public Boolean getUseExternalOpenvswitch() {
                                return null;
                            }
                        };
                    }

                    @Override
                    public OVNKubernetesConfig getOVNKubernetesConfig() {
                        return null;
                    }

                    @Override
                    public Map<String, String> getOtherConfig() {
                        return null;
                    }
                };
            }

            @Override
            public List<AdditionalNetworkDefinition> getAdditionalNetworks() {
                return null;
            }

            @Override
            public Boolean getDeployKubeProxy() {
                return null;
            }

            @Override
            public ProxyConfig getKubeProxyConfig() {
                return null;
            }
        };
    }
}
