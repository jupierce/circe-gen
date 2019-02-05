package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProviderConfig extends Bean {
	//json:type
	String getType() throws Exception;
	//json:basicAuth
	BasicAuthIdentityProvider getBasicAuth() throws Exception;
	//json:github
	GitHubIdentityProvider getGitHub() throws Exception;
	//json:gitlab
	GitLabIdentityProvider getGitLab() throws Exception;
	//json:google
	GoogleIdentityProvider getGoogle() throws Exception;
	//json:htpasswd
	HTPasswdIdentityProvider getHTPasswd() throws Exception;
	//json:keystone
	KeystoneIdentityProvider getKeystone() throws Exception;
	//json:ldap
	LDAPIdentityProvider getLDAP() throws Exception;
	//json:openID
	OpenIDIdentityProvider getOpenID() throws Exception;
	//json:requestHeader
	RequestHeaderIdentityProvider getRequestHeader() throws Exception;
}
