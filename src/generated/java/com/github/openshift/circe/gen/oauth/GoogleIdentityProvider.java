package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface GoogleIdentityProvider extends Bean {
	//json:clientID
	String getClientID() throws Exception;
	//json:clientSecret
	SecretNameReference getClientSecret() throws Exception;
	//json:hostedDomain
	String getHostedDomain() throws Exception;
}
