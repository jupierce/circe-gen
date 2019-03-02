// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NetworkControllerConfig extends Bean {

	@YamlPropertyName(value="networkPluginName")
	String getNetworkPluginName() throws Exception;

	@YamlPropertyName(value="clusterNetworks")
	List<ClusterNetworkEntry> getClusterNetworks() throws Exception;

	@YamlPropertyName(value="serviceNetworkCIDR")
	String getServiceNetworkCIDR() throws Exception;

	@YamlPropertyName(value="vxlanPort")
	Long getVXLANPort() throws Exception;

	interface EZ extends NetworkControllerConfig {

		@YamlPropertyName(value="networkPluginName")
		default String getNetworkPluginName() throws Exception { return null; }

		@YamlPropertyName(value="clusterNetworks")
		default List<ClusterNetworkEntry> getClusterNetworks() throws Exception { return null; }

		@YamlPropertyName(value="serviceNetworkCIDR")
		default String getServiceNetworkCIDR() throws Exception { return null; }

		@YamlPropertyName(value="vxlanPort")
		default Long getVXLANPort() throws Exception { return null; }

	}

}
