package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GitLabIdentityProvider extends Bean {
	//json:clientID
	String getClientID() throws Exception;
	//json:clientSecret
	SecretNameReference getClientSecret() throws Exception;
	//json:url
	String getURL() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
}
