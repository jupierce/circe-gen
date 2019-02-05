package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthRemoteConnectionInfo extends Bean {
	@YamlPropertyName(value="url")
	String getURL() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	@YamlPropertyName(value="tlsClientCert")
	SecretNameReference getTLSClientCert() throws Exception;

	@YamlPropertyName(value="tlsClientKey")
	SecretNameReference getTLSClientKey() throws Exception;

}
