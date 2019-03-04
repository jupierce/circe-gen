// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.kubeapiserveroperator.v1.*;
import com.github.openshift.circe.gen.kubeapiserverconfig.v1.*;
import com.github.openshift.circe.gen.clusterresourceoverrideconfig.v1.*;
import com.github.openshift.circe.gen.runoncedurationconfig.v1.*;
import com.github.openshift.circe.gen.kubecontrollermanageroperator.v1.*;
import com.github.openshift.circe.gen.kubecontrollermanagerconfig.v1.*;
import com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1.*;
import com.github.openshift.circe.beans.*;

public interface KubeControlPlaneUnit extends UnitBase {

	@RenderOrder(value ="0001")
	KubeAPIServerOperator getKubeAPIServerOperator() throws Exception;

	@RenderOrder(value ="0002")
	KubeControllerManagerOperator getKubeControllerManagerOperator() throws Exception;

	@RenderOrder(value ="0003")
	KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception;

	interface EZ extends KubeControlPlaneUnit {

		@RenderOrder(value ="0001")
		default KubeAPIServerOperator getKubeAPIServerOperator() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeControllerManagerOperator getKubeControllerManagerOperator() throws Exception { return null; }

		@RenderOrder(value ="0003")
		default KubeList<ValidatingWebhookConfiguration> getValidatingWebhookConfigurationList() throws Exception { return null; }

	}


}
