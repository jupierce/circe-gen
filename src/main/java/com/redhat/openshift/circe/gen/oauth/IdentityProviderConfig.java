package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
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
