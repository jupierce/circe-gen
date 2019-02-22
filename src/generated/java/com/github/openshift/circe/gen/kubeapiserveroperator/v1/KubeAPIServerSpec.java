package com.github.openshift.circe.gen.kubeapiserveroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerSpec extends Bean {

	@YamlPropertyName(value="staticPodOperatorSpec")
	@YamlPropertyInline
	StaticPodOperatorSpec getStaticPodOperatorSpec() throws Exception;

	@YamlPropertyName(value="forceRedeploymentReason")
	String getForceRedeploymentReason() throws Exception;

	interface EZ extends KubeAPIServerSpec {

		@YamlPropertyName(value="staticPodOperatorSpec")
		@YamlPropertyInline
		default StaticPodOperatorSpec getStaticPodOperatorSpec() throws Exception { return null; }

		@YamlPropertyName(value="forceRedeploymentReason")
		default String getForceRedeploymentReason() throws Exception { return null; }

	}

}
