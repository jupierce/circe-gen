package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserver.v1.*;
import com.github.openshift.circe.gen.openshiftapiserver.v1.*;
import com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1.*;
import com.github.openshift.circe.beans.*;

public interface ControlPlaneConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeAPIServerOperator getKubeAPIServerOperator() throws Exception;

	@RenderOrder(value ="0002")
	OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception;

	@RenderOrder(value ="0003")
	KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception;

	interface EZ extends ControlPlaneConfigDefinition {

		default KubeAPIServerOperator getKubeAPIServerOperator() throws Exception { return null; }

		default OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception { return null; }

		default KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception { return null; }

	}


}
