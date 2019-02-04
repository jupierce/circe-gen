package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GitHubIdentityProvider extends Bean {
	//json:clientID
	String getClientID() throws Exception;
	//json:clientSecret
	SecretNameReference getClientSecret() throws Exception;
	//json:organizations
	List<String> getOrganizations() throws Exception;
	//json:teams
	List<String> getTeams() throws Exception;
	//json:hostname
	String getHostname() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
}
