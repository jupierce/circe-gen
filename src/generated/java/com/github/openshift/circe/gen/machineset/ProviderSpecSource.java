package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProviderSpecSource extends Bean {
	//json:machineClass
	MachineClassRef getMachineClass() throws Exception;
}
