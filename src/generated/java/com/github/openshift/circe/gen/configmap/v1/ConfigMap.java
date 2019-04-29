// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.configmap.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMap extends Bean {

	default String getKind() { return "ConfigMap"; }
	default String getApiVersion() { return "v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-monitoring"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster-monitoring-config"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="data")
	Map<String,String> getData() throws Exception;

	@YamlPropertyName(value="binaryData")
	Map<String,List<Long>> getBinaryData() throws Exception;

	interface EZ extends ConfigMap {

		@YamlPropertyName(value="data")
		default Map<String,String> getData() throws Exception { return null; }

		@YamlPropertyName(value="binaryData")
		default Map<String,List<Long>> getBinaryData() throws Exception { return null; }

	}

}
