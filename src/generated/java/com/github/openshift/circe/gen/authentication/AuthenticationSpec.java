package com.github.openshift.circe.gen.authentication;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface AuthenticationSpec extends Bean {
	//json:type
	String getType() throws Exception;
	//json:oauthMetadata
	ConfigMapNameReference getOAuthMetadata() throws Exception;
	//json:webhookTokenAuthenticators
	List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception;
}
