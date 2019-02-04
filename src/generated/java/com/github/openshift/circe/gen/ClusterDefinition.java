package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.tuned.*;
import com.github.openshift.circe.gen.machineset.*;
import com.github.openshift.circe.gen.networkconfig.*;
import com.github.openshift.circe.beans.*;

public interface ClusterDefinition extends ConfigUnit {

	@RenderOrder(value ="0001")
	Tuned getTuned() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<MachineSet> getMachineSetList() throws Exception;

	@RenderOrder(value ="0003")
	NetworkConfig getNetworkConfig() throws Exception;


}
