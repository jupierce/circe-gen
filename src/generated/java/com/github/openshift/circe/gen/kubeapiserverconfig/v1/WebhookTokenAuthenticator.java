// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {

	@YamlPropertyName(value="configFile")
	String getConfigFile() throws Exception;

	@YamlPropertyName(value="cacheTTL")
	String getCacheTTL() throws Exception;

	interface EZ extends WebhookTokenAuthenticator {

		@YamlPropertyName(value="configFile")
		default String getConfigFile() throws Exception { return null; }

		@YamlPropertyName(value="cacheTTL")
		default String getCacheTTL() throws Exception { return null; }

	}

}
