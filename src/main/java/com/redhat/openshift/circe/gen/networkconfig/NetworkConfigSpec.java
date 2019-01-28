package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface NetworkConfigSpec {
	//json:clusterNetworks
	List<ClusterNetwork> getClusterNetworks();
	//json:serviceNetwork
	String getServiceNetwork();
	//json:defaultNetwork
	DefaultNetworkDefinition getDefaultNetwork();
	//json:additionalNetworks
	List<AdditionalNetworkDefinition> getAdditionalNetworks();
	//json:deployKubeProxy
	Boolean getDeployKubeProxy();
	//json:kubeProxyConfig
	ProxyConfig getKubeProxyConfig();
}
