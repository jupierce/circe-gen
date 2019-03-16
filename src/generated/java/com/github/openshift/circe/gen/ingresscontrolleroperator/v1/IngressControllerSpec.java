// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.ingresscontrolleroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IngressControllerSpec extends Bean {

	@YamlPropertyName(value="domain")
	String getDomain() throws Exception;

	@YamlPropertyName(value="replicas")
	Long getReplicas() throws Exception;

	@YamlPropertyName(value="endpointPublishingStrategy")
	EndpointPublishingStrategy getEndpointPublishingStrategy() throws Exception;

	@YamlPropertyName(value="defaultCertificate")
	LocalObjectReference getDefaultCertificate() throws Exception;

	@YamlPropertyName(value="namespaceSelector")
	LabelSelector getNamespaceSelector() throws Exception;

	@YamlPropertyName(value="routeSelector")
	LabelSelector getRouteSelector() throws Exception;

	@YamlPropertyName(value="nodePlacement")
	NodePlacement getNodePlacement() throws Exception;

	interface EZ extends IngressControllerSpec {

		@YamlPropertyName(value="domain")
		default String getDomain() throws Exception { return null; }

		@YamlPropertyName(value="replicas")
		default Long getReplicas() throws Exception { return null; }

		@YamlPropertyName(value="endpointPublishingStrategy")
		default EndpointPublishingStrategy getEndpointPublishingStrategy() throws Exception { return null; }

		@YamlPropertyName(value="defaultCertificate")
		default LocalObjectReference getDefaultCertificate() throws Exception { return null; }

		@YamlPropertyName(value="namespaceSelector")
		default LabelSelector getNamespaceSelector() throws Exception { return null; }

		@YamlPropertyName(value="routeSelector")
		default LabelSelector getRouteSelector() throws Exception { return null; }

		@YamlPropertyName(value="nodePlacement")
		default NodePlacement getNodePlacement() throws Exception { return null; }

	}

}
