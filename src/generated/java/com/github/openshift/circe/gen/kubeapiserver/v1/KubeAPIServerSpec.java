package com.github.openshift.circe.gen.kubeapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerSpec extends Bean {
	@YamlPropertyName(value="staticPodOperatorSpec")
	@YamlPropertyInline
	StaticPodOperatorSpec getStaticPodOperatorSpec() throws Exception;

	@YamlPropertyName(value="forceRedeploymentReason")
	String getForceRedeploymentReason() throws Exception;

}
