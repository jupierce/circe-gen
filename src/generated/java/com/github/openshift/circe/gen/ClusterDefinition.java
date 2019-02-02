package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.tuned.*;
import com.github.openshift.circe.gen.machineset.*;
import com.github.openshift.circe.gen.networkconfig.*;
import com.github.openshift.circe.beans.*;

public interface ClusterDefinition extends ConfigUnit {

	@RendererOrder(value ="0001")
	Tuned getTuned() throws Exception;

	@RendererOrder(value ="0002")
	MachineSet getMachineSet() throws Exception;

	@RendererOrder(value ="0003")
	NetworkConfig getNetworkConfig() throws Exception;


}
