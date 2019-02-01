package com.redhat.openshift.circe.gen.authentication;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface AuthenticationSpec extends Bean {
	//json:type
	String getType() throws Exception;
	//json:oauthMetadata
	ConfigMapNameReference getOAuthMetadata() throws Exception;
	//json:webhookTokenAuthenticators
	List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception;
}
