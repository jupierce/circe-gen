package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDIdentityProvider extends Bean {

	@YamlPropertyName(value="clientID")
	String getClientID() throws Exception;

	@YamlPropertyName(value="clientSecret")
	SecretNameReference getClientSecret() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	@YamlPropertyName(value="extraScopes")
	List<String> getExtraScopes() throws Exception;

	@YamlPropertyName(value="extraAuthorizeParameters")
	Map<String,String> getExtraAuthorizeParameters() throws Exception;

	@YamlPropertyName(value="urls")
	OpenIDURLs getURLs() throws Exception;

	@YamlPropertyName(value="claims")
	OpenIDClaims getClaims() throws Exception;

	interface EZ extends OpenIDIdentityProvider {

		default String getClientID() throws Exception { return null; }

		default SecretNameReference getClientSecret() throws Exception { return null; }

		default ConfigMapNameReference getCA() throws Exception { return null; }

		default List<String> getExtraScopes() throws Exception { return null; }

		default Map<String,String> getExtraAuthorizeParameters() throws Exception { return null; }

		default OpenIDURLs getURLs() throws Exception { return null; }

		default OpenIDClaims getClaims() throws Exception { return null; }

	}

}
