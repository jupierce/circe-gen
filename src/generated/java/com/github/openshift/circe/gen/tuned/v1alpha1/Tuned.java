package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Tuned extends Bean {

	default String getKind() { return "Tuned"; }
	default String getApiVersion() { return "v1alpha1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "default"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	TunedSpec getSpec() throws Exception;

	interface EZ extends Tuned {

		@YamlPropertyName(value="spec")
		default TunedSpec getSpec() throws Exception { return null; }

	}

}
