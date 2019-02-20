package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineSpec extends Bean {

	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-cluster-api"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "default"; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="taints")
	List<Taint> getTaints() throws Exception;

	@YamlPropertyName(value="providerSpec")
	ProviderSpec getProviderSpec() throws Exception;

	@YamlPropertyName(value="versions")
	MachineVersionInfo getVersions() throws Exception;

	@YamlPropertyName(value="configSource")
	NodeConfigSource getConfigSource() throws Exception;

	interface EZ extends MachineSpec {

		@YamlPropertyName(value="taints")
		default List<Taint> getTaints() throws Exception { return null; }

		@YamlPropertyName(value="providerSpec")
		default ProviderSpec getProviderSpec() throws Exception { return null; }

		@YamlPropertyName(value="versions")
		default MachineVersionInfo getVersions() throws Exception { return null; }

		@YamlPropertyName(value="configSource")
		default NodeConfigSource getConfigSource() throws Exception { return null; }

	}

}
