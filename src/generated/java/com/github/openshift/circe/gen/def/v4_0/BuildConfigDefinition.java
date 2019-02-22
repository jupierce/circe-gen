package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.builddefaultsconfig.v1.*;
import com.github.openshift.circe.gen.buildoverridesconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface BuildConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	BuildDefaultsConfig getBuildDefaultsConfig() throws Exception;

	@RenderOrder(value ="0002")
	BuildOverridesConfig getBuildOverridesConfig() throws Exception;

	interface EZ extends BuildConfigDefinition {

		@RenderOrder(value ="0001")
		default BuildDefaultsConfig getBuildDefaultsConfig() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default BuildOverridesConfig getBuildOverridesConfig() throws Exception { return null; }

	}


}
