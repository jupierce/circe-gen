// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.openshiftapiserveroperator.v1.*;
import com.github.openshift.circe.gen.genericapiserverconfig.v1.*;
import com.github.openshift.circe.gen.projectrequestlimitconfig.v1.*;
import com.github.openshift.circe.gen.admissionimagepolicyconfig.v1.*;
import com.github.openshift.circe.gen.openshiftcontrollermanageroperator.v1.*;
import com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface OpenShiftControlPlaneUnit extends UnitBase {

	@RenderOrder(value ="0001")
	OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception;

	@RenderOrder(value ="0002")
	OpenShiftControllerManagerOperator getOpenShiftControllerManagerOperator() throws Exception;

	interface EZ extends OpenShiftControlPlaneUnit {

		@RenderOrder(value ="0001")
		default OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default OpenShiftControllerManagerOperator getOpenShiftControllerManagerOperator() throws Exception { return null; }

	}


}
