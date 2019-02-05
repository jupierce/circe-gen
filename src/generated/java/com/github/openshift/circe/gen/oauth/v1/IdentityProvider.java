package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
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
