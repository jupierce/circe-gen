package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterNetworkEntry extends Bean {
	@YamlPropertyName(value="cidr")
	String getCIDR() throws Exception;

	@YamlPropertyName(value="hostSubnetLength")
	Long getHostSubnetLength() throws Exception;

}
