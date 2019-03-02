// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.build.v1.*;
import com.github.openshift.circe.beans.*;

public interface BuildUnit extends UnitBase {

	@RenderOrder(value ="0001")
	Build getBuild() throws Exception;

	interface EZ extends BuildUnit {

		@RenderOrder(value ="0001")
		default Build getBuild() throws Exception { return null; }

	}


}
