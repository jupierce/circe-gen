package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.networkconfig.*;

public interface ClusterDefinition {

	MachineSet getMachineSet();

	NetworkConfig getNetworkConfig();


}
