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

		default String getClientID() throws Exception { return null; }

		default SecretNameReference getClientSecret() throws Exception { return null; }

		default String getHostedDomain() throws Exception { return null; }

	}

}
