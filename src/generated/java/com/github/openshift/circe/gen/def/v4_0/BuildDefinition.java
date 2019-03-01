package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.build.v1.*;
import com.github.openshift.circe.beans.*;

public interface BuildDefinition extends Definition {

	@RenderOrder(value ="0001")
	Build getBuild() throws Exception;

	interface EZ extends BuildDefinition {

		@RenderOrder(value ="0001")
		default Build getBuild() throws Exception { return null; }

	}


}
