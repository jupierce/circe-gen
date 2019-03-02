// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface DockerPullSecretControllerConfig extends Bean {

	@YamlPropertyName(value="registryURLs")
	List<String> getRegistryURLs() throws Exception;

	@YamlPropertyName(value="internalRegistryHostname")
	String getInternalRegistryHostname() throws Exception;

	interface EZ extends DockerPullSecretControllerConfig {

		@YamlPropertyName(value="registryURLs")
		default List<String> getRegistryURLs() throws Exception { return null; }

		@YamlPropertyName(value="internalRegistryHostname")
		default String getInternalRegistryHostname() throws Exception { return null; }

	}

}
