package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface NetworkConfigSpec {
	//org.json:clusterNetworks
	List<ClusterNetwork> getClusterNetworks();
	//org.json:serviceNetwork
	String getServiceNetwork();
	//org.json:defaultNetwork
	DefaultNetworkDefinition getDefaultNetwork();
	//org.json:additionalNetworks
	List<AdditionalNetworkDefinition> getAdditionalNetworks();
	//org.json:deployKubeProxy
	Boolean getDeployKubeProxy();
	//org.json:kubeProxyConfig
	ProxyConfig getKubeProxyConfig();
}
