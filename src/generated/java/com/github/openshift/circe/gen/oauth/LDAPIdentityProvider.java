package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface LDAPIdentityProvider extends Bean {
	//json:url
	String getURL() throws Exception;
	//json:bindDN
	String getBindDN() throws Exception;
	//json:bindPassword
	SecretNameReference getBindPassword() throws Exception;
	//json:insecure
	Boolean getInsecure() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
	//json:attributes
	LDAPAttributeMapping getAttributes() throws Exception;
}
