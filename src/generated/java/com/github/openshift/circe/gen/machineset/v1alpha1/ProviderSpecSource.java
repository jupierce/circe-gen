package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProviderSpecSource extends Bean {

	@YamlPropertyName(value="machineClass")
	MachineClassRef getMachineClass() throws Exception;

	interface EZ extends ProviderSpecSource {

		default MachineClassRef getMachineClass() throws Exception { return null; }

	}

}
