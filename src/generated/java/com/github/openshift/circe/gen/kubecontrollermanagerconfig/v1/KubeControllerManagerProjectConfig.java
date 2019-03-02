// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubecontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeControllerManagerProjectConfig extends Bean {

	@YamlPropertyName(value="defaultNodeSelector")
	String getDefaultNodeSelector() throws Exception;

	interface EZ extends KubeControllerManagerProjectConfig {

		@YamlPropertyName(value="defaultNodeSelector")
		default String getDefaultNodeSelector() throws Exception { return null; }

	}

}
