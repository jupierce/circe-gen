package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.openshiftapiserveroperator.v1.*;
import com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1.*;
import com.github.openshift.circe.gen.genericapiserverconfig.v1.*;
import com.github.openshift.circe.gen.projectrequestlimitconfig.v1.*;
import com.github.openshift.circe.gen.imagepolicyconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface OpenShiftControlPlaneUnit extends Definition {

	@RenderOrder(value ="0001")
	OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception;

	@RenderOrder(value ="0002")
	OpenShiftControllerManagerConfig getOpenShiftControllerManagerConfig() throws Exception;

	interface EZ extends OpenShiftControlPlaneUnit {

		@RenderOrder(value ="0001")
		default OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default OpenShiftControllerManagerConfig getOpenShiftControllerManagerConfig() throws Exception { return null; }

	}


}
