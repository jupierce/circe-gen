// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.apiserver.v1.*;
import com.github.openshift.circe.beans.*;

public interface ControlPlaneUnit extends UnitBase {

	@RenderOrder(value ="0001")
	APIServer getAPIServer() throws Exception;

	interface EZ extends ControlPlaneUnit {

		@RenderOrder(value ="0001")
		default APIServer getAPIServer() throws Exception { return null; }

	}


}
