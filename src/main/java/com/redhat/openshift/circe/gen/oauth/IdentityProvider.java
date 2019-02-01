package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface IdentityProvider extends Bean {
	//json:name
	String getName() throws Exception;
	//json:challenge
	Boolean getUseAsChallenger() throws Exception;
	//json:login
	Boolean getUseAsLogin() throws Exception;
	//json:mappingMethod
	String getMappingMethod() throws Exception;
	//json:identityProviderConfig
	IdentityProviderConfig getIdentityProviderConfig() throws Exception;
}
