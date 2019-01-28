package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.tuned.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.project.*;
import com.redhat.openshift.circe.gen.networkconfig.*;

public interface ClusterDefinition {

	Tuned getTuned();

	MachineSet getMachineSet();

	Project getProject();

	NetworkConfig getNetworkConfig();


}
