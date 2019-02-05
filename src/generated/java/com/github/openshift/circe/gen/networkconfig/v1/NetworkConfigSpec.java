package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NetworkConfigSpec extends Bean {
	@YamlPropertyName(value="clusterNetworks")
	List<ClusterNetwork> getClusterNetworks() throws Exception;

	@YamlPropertyName(value="serviceNetwork")
	String getServiceNetwork() throws Exception;

	@YamlPropertyName(value="defaultNetwork")
	DefaultNetworkDefinition getDefaultNetwork() throws Exception;

	@YamlPropertyName(value="additionalNetworks")
	List<AdditionalNetworkDefinition> getAdditionalNetworks() throws Exception;

	@YamlPropertyName(value="deployKubeProxy")
	Boolean getDeployKubeProxy() throws Exception;

	@YamlPropertyName(value="kubeProxyConfig")
	ProxyConfig getKubeProxyConfig() throws Exception;

	@YamlPropertyName(value="someNewField")
	String getSomeNewField() throws Exception;

}
