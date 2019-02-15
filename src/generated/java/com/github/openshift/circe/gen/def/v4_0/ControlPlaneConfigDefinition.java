package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserverconfig.v1.*;
import com.github.openshift.circe.gen.kubeapiserver.v1.*;
import com.github.openshift.circe.gen.openshiftapiserver.v1.*;
import com.github.openshift.circe.gen.openshiftapiserverconfig.v1.*;
import com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface ControlPlaneConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeAPIServerConfig getKubeAPIServerConfig() throws Exception;

	@RenderOrder(value ="0002")
	KubeAPIServer getKubeAPIServer() throws Exception;

	@RenderOrder(value ="0003")
	OpenShiftAPIServer getOpenShiftAPIServer() throws Exception;

	@RenderOrder(value ="0004")
	OpenShiftAPIServerConfig getOpenShiftAPIServerConfig() throws Exception;

	@RenderOrder(value ="0005")
	OpenShiftControllerManagerConfig getOpenShiftControllerManagerConfig() throws Exception;


}
