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

}
