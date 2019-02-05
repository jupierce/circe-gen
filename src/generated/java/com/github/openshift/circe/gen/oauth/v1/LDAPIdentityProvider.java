package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LDAPIdentityProvider extends Bean {
	@YamlPropertyName(value="url")
	String getURL() throws Exception;

	@YamlPropertyName(value="bindDN")
	String getBindDN() throws Exception;

	@YamlPropertyName(value="bindPassword")
	SecretNameReference getBindPassword() throws Exception;

	@YamlPropertyName(value="insecure")
	Boolean getInsecure() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	@YamlPropertyName(value="attributes")
	LDAPAttributeMapping getAttributes() throws Exception;

}
