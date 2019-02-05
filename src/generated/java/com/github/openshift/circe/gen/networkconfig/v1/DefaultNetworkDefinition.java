package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface DefaultNetworkDefinition extends Bean {
	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="openshiftSDNConfig")
	OpenShiftSDNConfig getOpenShiftSDNConfig() throws Exception;

	@YamlPropertyName(value="ovnKubernetesConfig")
	OVNKubernetesConfig getOVNKubernetesConfig() throws Exception;

	@YamlPropertyName(value="otherConfig")
	Map<String,String> getOtherConfig() throws Exception;

}
