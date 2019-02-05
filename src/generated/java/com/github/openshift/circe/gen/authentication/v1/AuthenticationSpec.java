package com.github.openshift.circe.gen.authentication.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AuthenticationSpec extends Bean {
	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="oauthMetadata")
	ConfigMapNameReference getOAuthMetadata() throws Exception;

	@YamlPropertyName(value="webhookTokenAuthenticators")
	List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception;

}
