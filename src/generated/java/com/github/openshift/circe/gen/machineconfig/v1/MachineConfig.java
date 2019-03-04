// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineConfig extends Bean {

	default String getKind() { return "MachineConfig"; }
	default String getApiVersion() { return "machineconfiguration.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return ""; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="spec")
	MachineConfigSpec getSpec() throws Exception;

	interface EZ extends MachineConfig {

		@YamlPropertyName(value="spec")
		default MachineConfigSpec getSpec() throws Exception { return null; }

	}

}
