package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.tuned.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.networkconfig.*;
import com.redhat.openshift.circe.beans.*;

public interface ClusterDefinition {

	Tuned getTuned() throws Exception;

	MachineSet getMachineSet() throws Exception;

	NetworkConfig getNetworkConfig() throws Exception;


}
