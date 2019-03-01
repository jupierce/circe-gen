package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserverconfig.v1.*;
import com.github.openshift.circe.gen.kubeapiserveroperator.v1.*;
import com.github.openshift.circe.gen.openshiftapiserverconfig.v1.*;
import com.github.openshift.circe.gen.openshiftapiserveroperator.v1.*;
import com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1.*;
import com.github.openshift.circe.gen.clusterresourceoverrideconfig.v1.*;
import com.github.openshift.circe.gen.runoncedurationconfig.v1.*;
import com.github.openshift.circe.gen.clusterresourceoverrideconfig.v1.*;
import com.github.openshift.circe.gen.projectrequestlimitconfig.v1.*;
import com.github.openshift.circe.gen.imagepolicyconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface ControlPlaneConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeAPIServerConfig getKubeAPIServerConfig() throws Exception;

	@RenderOrder(value ="0002")
	KubeAPIServerOperator getKubeAPIServerOperator() throws Exception;

	@RenderOrder(value ="0003")
	OpenShiftAPIServerConfig getOpenShiftAPIServerConfig() throws Exception;

	@RenderOrder(value ="0004")
	OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception;

	@RenderOrder(value ="0005")
	KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception;

	interface EZ extends ControlPlaneConfigDefinition {

		@RenderOrder(value ="0001")
		default KubeAPIServerConfig getKubeAPIServerConfig() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeAPIServerOperator getKubeAPIServerOperator() throws Exception { return null; }

		@RenderOrder(value ="0003")
		default OpenShiftAPIServerConfig getOpenShiftAPIServerConfig() throws Exception { return null; }

		@RenderOrder(value ="0004")
		default OpenShiftAPIServerOperator getOpenShiftAPIServerOperator() throws Exception { return null; }

		@RenderOrder(value ="0005")
		default KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception { return null; }

	}


}
