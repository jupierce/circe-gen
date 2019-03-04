// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeClientConfig extends Bean {

	@YamlPropertyName(value="kubeConfig")
	String getKubeConfig() throws Exception;

	@YamlPropertyName(value="connectionOverrides")
	ClientConnectionOverrides getConnectionOverrides() throws Exception;

	interface EZ extends KubeClientConfig {

		@YamlPropertyName(value="kubeConfig")
		default String getKubeConfig() throws Exception { return null; }

		@YamlPropertyName(value="connectionOverrides")
		default ClientConnectionOverrides getConnectionOverrides() throws Exception { return null; }

	}

}
