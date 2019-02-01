package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProviderSpecSource extends Bean {
	//json:machineClass
	MachineClassRef getMachineClass() throws Exception;
}
