// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RequestHeaderIdentityProvider extends Bean {

	@YamlPropertyName(value="loginURL")
	String getLoginURL() throws Exception;

	@YamlPropertyName(value="challengeURL")
	String getChallengeURL() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getClientCA() throws Exception;

	@YamlPropertyName(value="clientCommonNames")
	List<String> getClientCommonNames() throws Exception;

	@YamlPropertyName(value="headers")
	List<String> getHeaders() throws Exception;

	@YamlPropertyName(value="preferredUsernameHeaders")
	List<String> getPreferredUsernameHeaders() throws Exception;

	@YamlPropertyName(value="nameHeaders")
	List<String> getNameHeaders() throws Exception;

	@YamlPropertyName(value="emailHeaders")
	List<String> getEmailHeaders() throws Exception;

	interface EZ extends RequestHeaderIdentityProvider {

		@YamlPropertyName(value="loginURL")
		default String getLoginURL() throws Exception { return null; }

		@YamlPropertyName(value="challengeURL")
		default String getChallengeURL() throws Exception { return null; }

		@YamlPropertyName(value="ca")
		default ConfigMapNameReference getClientCA() throws Exception { return null; }

		@YamlPropertyName(value="clientCommonNames")
		default List<String> getClientCommonNames() throws Exception { return null; }

		@YamlPropertyName(value="headers")
		default List<String> getHeaders() throws Exception { return null; }

		@YamlPropertyName(value="preferredUsernameHeaders")
		default List<String> getPreferredUsernameHeaders() throws Exception { return null; }

		@YamlPropertyName(value="nameHeaders")
		default List<String> getNameHeaders() throws Exception { return null; }

		@YamlPropertyName(value="emailHeaders")
		default List<String> getEmailHeaders() throws Exception { return null; }

	}

}
