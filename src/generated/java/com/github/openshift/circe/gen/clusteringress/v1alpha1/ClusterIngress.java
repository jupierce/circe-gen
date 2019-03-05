// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.clusteringress.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterIngress extends Bean {

	default String getKind() { return "ClusterIngress"; }
	default String getApiVersion() { return "ingress.openshift.io/v1alpha1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	ClusterIngressSpec getSpec() throws Exception;

	interface EZ extends ClusterIngress {

		@YamlPropertyName(value="spec")
		default ClusterIngressSpec getSpec() throws Exception { return null; }

	}

}
