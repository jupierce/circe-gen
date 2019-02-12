package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserver.v1.*;
import com.github.openshift.circe.gen.openshiftapiserver.v1.*;
import com.github.openshift.circe.beans.*;

public interface ApiServerConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeAPIServer getKubeAPIServer() throws Exception;

	@RenderOrder(value ="0002")
	OpenShiftAPIServer getOpenShiftAPIServer() throws Exception;


}
