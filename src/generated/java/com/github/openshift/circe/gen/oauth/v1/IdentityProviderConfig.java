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

		default String getType() throws Exception { return null; }

		default BasicAuthIdentityProvider getBasicAuth() throws Exception { return null; }

		default GitHubIdentityProvider getGitHub() throws Exception { return null; }

		default GitLabIdentityProvider getGitLab() throws Exception { return null; }

		default GoogleIdentityProvider getGoogle() throws Exception { return null; }

		default HTPasswdIdentityProvider getHTPasswd() throws Exception { return null; }

		default KeystoneIdentityProvider getKeystone() throws Exception { return null; }

		default LDAPIdentityProvider getLDAP() throws Exception { return null; }

		default OpenIDIdentityProvider getOpenID() throws Exception { return null; }

		default RequestHeaderIdentityProvider getRequestHeader() throws Exception { return null; }

	}

}
