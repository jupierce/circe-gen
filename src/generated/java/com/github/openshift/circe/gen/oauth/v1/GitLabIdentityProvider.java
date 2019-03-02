// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GitLabIdentityProvider extends Bean {

	@YamlPropertyName(value="clientID")
	String getClientID() throws Exception;

	@YamlPropertyName(value="clientSecret")
	SecretNameReference getClientSecret() throws Exception;

	@YamlPropertyName(value="url")
	String getURL() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	interface EZ extends GitLabIdentityProvider {

		@YamlPropertyName(value="clientID")
		default String getClientID() throws Exception { return null; }

		@YamlPropertyName(value="clientSecret")
		default SecretNameReference getClientSecret() throws Exception { return null; }

		@YamlPropertyName(value="url")
		default String getURL() throws Exception { return null; }

		@YamlPropertyName(value="ca")
		default ConfigMapNameReference getCA() throws Exception { return null; }

	}

}
