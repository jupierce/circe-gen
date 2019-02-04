package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthRemoteConnectionInfo extends Bean {
	//json:url
	String getURL() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
	//json:tlsClientCert
	SecretNameReference getTLSClientCert() throws Exception;
	//json:tlsClientKey
	SecretNameReference getTLSClientKey() throws Exception;
}
