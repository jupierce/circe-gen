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

}
