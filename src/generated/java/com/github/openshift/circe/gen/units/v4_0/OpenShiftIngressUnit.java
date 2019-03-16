// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.ingresscontrolleroperator.v1.*;
import com.github.openshift.circe.beans.*;

public interface OpenShiftIngressUnit extends UnitBase {

	@RenderOrder(value ="0001")
	IngressControllerOperator getIngressControllerOperator() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<Secret> getSecretList() throws Exception;

	interface EZ extends OpenShiftIngressUnit {

		@RenderOrder(value ="0001")
		default IngressControllerOperator getIngressControllerOperator() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeList<Secret> getSecretList() throws Exception { return null; }

	}


}
