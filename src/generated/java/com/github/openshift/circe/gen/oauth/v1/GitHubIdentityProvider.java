package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GitHubIdentityProvider extends Bean {

	@YamlPropertyName(value="clientID")
	String getClientID() throws Exception;

	@YamlPropertyName(value="clientSecret")
	SecretNameReference getClientSecret() throws Exception;

	@YamlPropertyName(value="organizations")
	List<String> getOrganizations() throws Exception;

	@YamlPropertyName(value="teams")
	List<String> getTeams() throws Exception;

	@YamlPropertyName(value="hostname")
	String getHostname() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	interface EZ extends GitHubIdentityProvider {

		default String getClientID() throws Exception { return null; }

		default SecretNameReference getClientSecret() throws Exception { return null; }

		default List<String> getOrganizations() throws Exception { return null; }

		default List<String> getTeams() throws Exception { return null; }

		default String getHostname() throws Exception { return null; }

		default ConfigMapNameReference getCA() throws Exception { return null; }

	}

}
