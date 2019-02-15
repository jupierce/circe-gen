package com.github.openshift.circe.gen.machineconfigpool.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineConfigPool extends Bean {

	default String getKind() { return "MachineConfigPool"; }
	default String getApiVersion() { return "machineconfiguration.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-machine-config-operator"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return ""; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="spec")
	MachineConfigPoolSpec getSpec() throws Exception;

	interface EZ extends MachineConfigPool {

		default MachineConfigPoolSpec getSpec() throws Exception { return null; }

	}

}
