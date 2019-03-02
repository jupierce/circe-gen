// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.networkconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface NetworkUnit extends UnitBase {

	@RenderOrder(value ="0001")
	NetworkConfig getNetworkConfig() throws Exception;

	interface EZ extends NetworkUnit {

		@RenderOrder(value ="0001")
		default NetworkConfig getNetworkConfig() throws Exception { return null; }

	}


}
