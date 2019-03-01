package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.build.v1.*;
import com.github.openshift.circe.beans.*;

public interface BuildConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	Build getBuild() throws Exception;

	interface EZ extends BuildConfigDefinition {

		@RenderOrder(value ="0001")
		default Build getBuild() throws Exception { return null; }

	}


}
