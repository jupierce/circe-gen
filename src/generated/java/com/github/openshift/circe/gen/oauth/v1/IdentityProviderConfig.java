package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProviderConfig extends Bean {

	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="basicAuth")
	BasicAuthIdentityProvider getBasicAuth() throws Exception;

	@YamlPropertyName(value="github")
	GitHubIdentityProvider getGitHub() throws Exception;

	@YamlPropertyName(value="gitlab")
	GitLabIdentityProvider getGitLab() throws Exception;

	@YamlPropertyName(value="google")
	GoogleIdentityProvider getGoogle() throws Exception;

	@YamlPropertyName(value="htpasswd")
	HTPasswdIdentityProvider getHTPasswd() throws Exception;

	@YamlPropertyName(value="keystone")
	KeystoneIdentityProvider getKeystone() throws Exception;

	@YamlPropertyName(value="ldap")
	LDAPIdentityProvider getLDAP() throws Exception;

	@YamlPropertyName(value="openID")
	OpenIDIdentityProvider getOpenID() throws Exception;

	@YamlPropertyName(value="requestHeader")
	RequestHeaderIdentityProvider getRequestHeader() throws Exception;

	interface EZ extends IdentityProviderConfig {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

		@YamlPropertyName(value="basicAuth")
		default BasicAuthIdentityProvider getBasicAuth() throws Exception { return null; }

		@YamlPropertyName(value="github")
		default GitHubIdentityProvider getGitHub() throws Exception { return null; }

		@YamlPropertyName(value="gitlab")
		default GitLabIdentityProvider getGitLab() throws Exception { return null; }

		@YamlPropertyName(value="google")
		default GoogleIdentityProvider getGoogle() throws Exception { return null; }

		@YamlPropertyName(value="htpasswd")
		default HTPasswdIdentityProvider getHTPasswd() throws Exception { return null; }

		@YamlPropertyName(value="keystone")
		default KeystoneIdentityProvider getKeystone() throws Exception { return null; }

		@YamlPropertyName(value="ldap")
		default LDAPIdentityProvider getLDAP() throws Exception { return null; }

		@YamlPropertyName(value="openID")
		default OpenIDIdentityProvider getOpenID() throws Exception { return null; }

		@YamlPropertyName(value="requestHeader")
		default RequestHeaderIdentityProvider getRequestHeader() throws Exception { return null; }

	}

}
