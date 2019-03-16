// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.ingresscontrolleroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IngressControllerOperator extends Bean {

	default String getKind() { return "IngressController"; }
	default String getApiVersion() { return "operator.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	IngressControllerSpec getSpec() throws Exception;

	interface EZ extends IngressControllerOperator {

		@YamlPropertyName(value="spec")
		default IngressControllerSpec getSpec() throws Exception { return null; }

	}

}
