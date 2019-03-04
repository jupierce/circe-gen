// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanageroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftControllerManagerOperator extends Bean {

	default String getKind() { return "OpenShiftControllerManager"; }
	default String getApiVersion() { return "operator.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	OpenShiftControllerManagerSpec getSpec() throws Exception;

	interface EZ extends OpenShiftControllerManagerOperator {

		@YamlPropertyName(value="spec")
		default OpenShiftControllerManagerSpec getSpec() throws Exception { return null; }

	}

}
