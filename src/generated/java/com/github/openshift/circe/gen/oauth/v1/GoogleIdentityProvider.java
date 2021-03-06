// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GoogleIdentityProvider extends Bean {

	@YamlPropertyName(value="clientID")
	String getClientID() throws Exception;

	@YamlPropertyName(value="clientSecret")
	SecretNameReference getClientSecret() throws Exception;

	@YamlPropertyName(value="hostedDomain")
	String getHostedDomain() throws Exception;

	interface EZ extends GoogleIdentityProvider {

		@YamlPropertyName(value="clientID")
		default String getClientID() throws Exception { return null; }

		@YamlPropertyName(value="clientSecret")
		default SecretNameReference getClientSecret() throws Exception { return null; }

		@YamlPropertyName(value="hostedDomain")
		default String getHostedDomain() throws Exception { return null; }

	}

}
