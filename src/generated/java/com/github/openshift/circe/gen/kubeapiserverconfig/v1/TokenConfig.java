// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TokenConfig extends Bean {

	@YamlPropertyName(value="authorizeTokenMaxAgeSeconds")
	Long getAuthorizeTokenMaxAgeSeconds() throws Exception;

	@YamlPropertyName(value="accessTokenMaxAgeSeconds")
	Long getAccessTokenMaxAgeSeconds() throws Exception;

	@YamlPropertyName(value="accessTokenInactivityTimeoutSeconds")
	Long getAccessTokenInactivityTimeoutSeconds() throws Exception;

	interface EZ extends TokenConfig {

		@YamlPropertyName(value="authorizeTokenMaxAgeSeconds")
		default Long getAuthorizeTokenMaxAgeSeconds() throws Exception { return null; }

		@YamlPropertyName(value="accessTokenMaxAgeSeconds")
		default Long getAccessTokenMaxAgeSeconds() throws Exception { return null; }

		@YamlPropertyName(value="accessTokenInactivityTimeoutSeconds")
		default Long getAccessTokenInactivityTimeoutSeconds() throws Exception { return null; }

	}

}
