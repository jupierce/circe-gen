package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
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
