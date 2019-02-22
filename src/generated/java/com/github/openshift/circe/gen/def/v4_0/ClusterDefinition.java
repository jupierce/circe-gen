package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.tuned.v1alpha1.*;
import com.github.openshift.circe.gen.machineset.v1alpha1.*;
import com.github.openshift.circe.gen.networkconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface ClusterDefinition extends Definition {

	@RenderOrder(value ="0001")
	Tuned getTuned() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<MachineSet> getMachineSetList() throws Exception;

	@RenderOrder(value ="0003")
	NetworkConfig getNetworkConfig() throws Exception;

	interface EZ extends ClusterDefinition {

		@RenderOrder(value ="0001")
		default Tuned getTuned() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeList<MachineSet> getMachineSetList() throws Exception { return null; }

		@RenderOrder(value ="0003")
		default NetworkConfig getNetworkConfig() throws Exception { return null; }

	}


}
