// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.clusteringress.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterIngressSpec extends Bean {

	@YamlPropertyName(value="ingressDomain")
	String getIngressDomain() throws Exception;

	@YamlPropertyName(value="nodePlacement")
	NodePlacement getNodePlacement() throws Exception;

	@YamlPropertyName(value="defaultCertificateSecret")
	String getDefaultCertificateSecret() throws Exception;

	@YamlPropertyName(value="namespaceSelector")
	LabelSelector getNamespaceSelector() throws Exception;

	@YamlPropertyName(value="replicas")
	Long getReplicas() throws Exception;

	@YamlPropertyName(value="routeSelector")
	LabelSelector getRouteSelector() throws Exception;

	@YamlPropertyName(value="highAvailability")
	ClusterIngressHighAvailability getHighAvailability() throws Exception;

	@YamlPropertyName(value="unsupportedExtensions")
	List<String> getUnsupportedExtensions() throws Exception;

	interface EZ extends ClusterIngressSpec {

		@YamlPropertyName(value="ingressDomain")
		default String getIngressDomain() throws Exception { return null; }

		@YamlPropertyName(value="nodePlacement")
		default NodePlacement getNodePlacement() throws Exception { return null; }

		@YamlPropertyName(value="defaultCertificateSecret")
		default String getDefaultCertificateSecret() throws Exception { return null; }

		@YamlPropertyName(value="namespaceSelector")
		default LabelSelector getNamespaceSelector() throws Exception { return null; }

		@YamlPropertyName(value="replicas")
		default Long getReplicas() throws Exception { return null; }

		@YamlPropertyName(value="routeSelector")
		default LabelSelector getRouteSelector() throws Exception { return null; }

		@YamlPropertyName(value="highAvailability")
		default ClusterIngressHighAvailability getHighAvailability() throws Exception { return null; }

		@YamlPropertyName(value="unsupportedExtensions")
		default List<String> getUnsupportedExtensions() throws Exception { return null; }

	}

}
