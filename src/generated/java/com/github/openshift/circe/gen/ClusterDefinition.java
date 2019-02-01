package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.tuned.*;
import com.github.openshift.circe.gen.machineset.*;
import com.github.openshift.circe.gen.networkconfig.*;
import com.github.openshift.circe.beans.*;

public interface ClusterDefinition {

	Tuned getTuned() throws Exception;

	MachineSet getMachineSet() throws Exception;

	NetworkConfig getNetworkConfig() throws Exception;


}
