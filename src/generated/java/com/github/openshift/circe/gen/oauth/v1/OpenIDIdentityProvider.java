package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDIdentityProvider extends Bean {
	//json:clientID
	String getClientID() throws Exception;
	//json:clientSecret
	SecretNameReference getClientSecret() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
	//json:extraScopes
	List<String> getExtraScopes() throws Exception;
	//json:extraAuthorizeParameters
	Map<String,String> getExtraAuthorizeParameters() throws Exception;
	//json:urls
	OpenIDURLs getURLs() throws Exception;
	//json:claims
	OpenIDClaims getClaims() throws Exception;
}
