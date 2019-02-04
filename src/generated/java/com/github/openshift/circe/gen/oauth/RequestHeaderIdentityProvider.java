package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RequestHeaderIdentityProvider extends Bean {
	//json:loginURL
	String getLoginURL() throws Exception;
	//json:challengeURL
	String getChallengeURL() throws Exception;
	//json:ca
	ConfigMapNameReference getClientCA() throws Exception;
	//json:clientCommonNames
	List<String> getClientCommonNames() throws Exception;
	//json:headers
	List<String> getHeaders() throws Exception;
	//json:preferredUsernameHeaders
	List<String> getPreferredUsernameHeaders() throws Exception;
	//json:nameHeaders
	List<String> getNameHeaders() throws Exception;
	//json:emailHeaders
	List<String> getEmailHeaders() throws Exception;
}
