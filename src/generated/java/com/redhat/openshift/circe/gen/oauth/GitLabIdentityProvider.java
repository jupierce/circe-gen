package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
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
