// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfigpool.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineConfigPoolSpec extends Bean {

	@YamlPropertyName(value="machineConfigSelector")
	LabelSelector getMachineConfigSelector() throws Exception;

	@YamlPropertyName(value="machineSelector")
	LabelSelector getMachineSelector() throws Exception;

	@YamlPropertyName(value="paused")
	Boolean getPaused() throws Exception;

	@YamlPropertyName(value="maxUnavailable")
	IntOrString getMaxUnavailable() throws Exception;

	interface EZ extends MachineConfigPoolSpec {

		@YamlPropertyName(value="machineConfigSelector")
		default LabelSelector getMachineConfigSelector() throws Exception { return null; }

		@YamlPropertyName(value="machineSelector")
		default LabelSelector getMachineSelector() throws Exception { return null; }

		@YamlPropertyName(value="paused")
		default Boolean getPaused() throws Exception { return null; }

		@YamlPropertyName(value="maxUnavailable")
		default IntOrString getMaxUnavailable() throws Exception { return null; }

	}

}
