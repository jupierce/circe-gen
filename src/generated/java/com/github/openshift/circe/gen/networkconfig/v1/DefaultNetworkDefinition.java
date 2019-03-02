// GENERATED FILE -- DO NOT ALTER (circe.go)

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

	interface EZ extends DefaultNetworkDefinition {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

		@YamlPropertyName(value="openshiftSDNConfig")
		default OpenShiftSDNConfig getOpenShiftSDNConfig() throws Exception { return null; }

		@YamlPropertyName(value="ovnKubernetesConfig")
		default OVNKubernetesConfig getOVNKubernetesConfig() throws Exception { return null; }

		@YamlPropertyName(value="otherConfig")
		default Map<String,String> getOtherConfig() throws Exception { return null; }

	}

}
