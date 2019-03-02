// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubecontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeControllerManagerConfig extends Bean {

	default String getKind() { return "KubeControllerManagerConfig"; }
	default String getApiVersion() { return "kubecontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="serviceServingCert")
	ServiceServingCert getServiceServingCert() throws Exception;

	@YamlPropertyName(value="projectConfig")
	KubeControllerManagerProjectConfig getProjectConfig() throws Exception;

	@YamlPropertyName(value="extendedArguments")
	Map<String,List<String>> getExtendedArguments() throws Exception;

	interface EZ extends KubeControllerManagerConfig {

		@YamlPropertyName(value="serviceServingCert")
		default ServiceServingCert getServiceServingCert() throws Exception { return null; }

		@YamlPropertyName(value="projectConfig")
		default KubeControllerManagerProjectConfig getProjectConfig() throws Exception { return null; }

		@YamlPropertyName(value="extendedArguments")
		default Map<String,List<String>> getExtendedArguments() throws Exception { return null; }

	}

}
