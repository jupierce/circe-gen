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

	interface EZ extends OAuthRemoteConnectionInfo {

		default String getURL() throws Exception { return null; }

		default ConfigMapNameReference getCA() throws Exception { return null; }

		default SecretNameReference getTLSClientCert() throws Exception { return null; }

		default SecretNameReference getTLSClientKey() throws Exception { return null; }

	}

}
