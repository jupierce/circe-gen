// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubecontrollermanageroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeControllerManagerSpec extends Bean {

	@YamlPropertyName(value="staticPodOperatorSpec")
	@YamlPropertyInline
	StaticPodOperatorSpec getStaticPodOperatorSpec() throws Exception;

	interface EZ extends KubeControllerManagerSpec {

		@YamlPropertyName(value="staticPodOperatorSpec")
		@YamlPropertyInline
		default StaticPodOperatorSpec getStaticPodOperatorSpec() throws Exception { return null; }

	}

}
