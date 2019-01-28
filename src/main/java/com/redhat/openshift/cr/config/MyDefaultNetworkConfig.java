package com.redhat.openshift.cr.config;


import com.redhat.openshift.circe.gen.networkconfig_types.*;

import java.util.List;

public class MyDefaultNetworkConfig implements NetworkConfig {

    public Long getHello() {
        return new Long(5);
    }

    public class MyDefaultNetworkConfigSpec implements NetworkConfigSpec {

        public List<ClusterNetwork> getClusterNetworks() {
            return null;
        }

        public String getServiceNetwork() {
            return "myservicenetwork";
        }

        @Override
        public DefaultNetworkDefinition getDefaultNetwork() {
            return null;
        }

        public List<AdditionalNetworkDefinition> getAdditionalNetworks() {
            return null;
        }

        public Boolean getDeployKubeProxy() {
            return true;
        }

        public ProxyConfig getKubeProxyConfig() {
            return null;
        }
    }

    public NetworkConfigSpec getSpec() {
        return new MyDefaultNetworkConfigSpec();
    }
}
