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

		default String getLoginURL() throws Exception { return null; }

		default String getChallengeURL() throws Exception { return null; }

		default ConfigMapNameReference getClientCA() throws Exception { return null; }

		default List<String> getClientCommonNames() throws Exception { return null; }

		default List<String> getHeaders() throws Exception { return null; }

		default List<String> getPreferredUsernameHeaders() throws Exception { return null; }

		default List<String> getNameHeaders() throws Exception { return null; }

		default List<String> getEmailHeaders() throws Exception { return null; }

	}

}
