package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
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
