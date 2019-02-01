package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface NetworkConfigSpec extends Bean {
	//json:clusterNetworks
	List<ClusterNetwork> getClusterNetworks() throws Exception;
	//json:serviceNetwork
	String getServiceNetwork() throws Exception;
	//json:defaultNetwork
	DefaultNetworkDefinition getDefaultNetwork() throws Exception;
	//json:additionalNetworks
	List<AdditionalNetworkDefinition> getAdditionalNetworks() throws Exception;
	//json:deployKubeProxy
	Boolean getDeployKubeProxy() throws Exception;
	//json:kubeProxyConfig
	ProxyConfig getKubeProxyConfig() throws Exception;
	//json:someNewField
	String getSomeNewField() throws Exception;
}
