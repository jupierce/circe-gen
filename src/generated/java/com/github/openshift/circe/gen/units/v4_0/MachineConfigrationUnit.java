// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.machineconfigpool.v1.*;
import com.github.openshift.circe.gen.machineconfig.v1.*;
import com.github.openshift.circe.gen.tuned.v1alpha1.*;
import com.github.openshift.circe.beans.*;

public interface MachineConfigrationUnit extends UnitBase {

	@RenderOrder(value ="0001")
	KubeList<MachineConfigPool> getMachineConfigPoolList() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<MachineConfig> getMachineConfigList() throws Exception;

	@RenderOrder(value ="0003")
	Tuned getTuned() throws Exception;

	interface EZ extends MachineConfigrationUnit {

		@RenderOrder(value ="0001")
		default KubeList<MachineConfigPool> getMachineConfigPoolList() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeList<MachineConfig> getMachineConfigList() throws Exception { return null; }

		@RenderOrder(value ="0003")
		default Tuned getTuned() throws Exception { return null; }

	}


}
