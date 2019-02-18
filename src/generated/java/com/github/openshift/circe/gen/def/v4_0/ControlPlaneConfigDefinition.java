package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserver.v1.*;
import com.github.openshift.circe.gen.openshiftapiserver.v1.*;
import com.github.openshift.circe.beans.*;

public interface ControlPlaneConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeAPIServer getKubeAPIServer() throws Exception;

	@RenderOrder(value ="0002")
	OpenShiftAPIServer getOpenShiftAPIServer() throws Exception;

	interface EZ extends ControlPlaneConfigDefinition {

		default KubeAPIServer getKubeAPIServer() throws Exception { return null; }

		default OpenShiftAPIServer getOpenShiftAPIServer() throws Exception { return null; }

	}


}
