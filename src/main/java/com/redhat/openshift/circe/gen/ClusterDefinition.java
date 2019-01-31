package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.tuned.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.networkconfig.*;
import com.redhat.openshift.circe.gen.impl.*;

public interface ClusterDefinition {

	Tuned getTuned();

	MachineSet getMachineSet();

	NetworkConfig getNetworkConfig();


}
