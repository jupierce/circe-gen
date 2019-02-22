package com.github.openshift.circe.gen.kubeapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerOperator extends Bean {

	default String getKind() { return "KubeAPIServer"; }
	default String getApiVersion() { return "operator.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	KubeAPIServerSpec getSpec() throws Exception;

	interface EZ extends KubeAPIServerOperator {

		@YamlPropertyName(value="spec")
		default KubeAPIServerSpec getSpec() throws Exception { return null; }

	}

}
evisionLimit")
		default Long getSucceededRevisionLimit() throws Exception { return null; }

	}

}
lue="operandSpecs")
		default List<OperandSpec> getOperandSpecs() throws Exception { return null; }

		@YamlPropertyName(value="unsupportedConfigOverrides")
		default String getUnsupportedConfigOverrides() throws Exception { return null; }

		@YamlPropertyName(value="observedConfig")
		default String getObservedConfig() throws Exception { return null; }

	}

}
