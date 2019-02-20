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

	interface EZ extends AuthenticationSpec {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

		@YamlPropertyName(value="oauthMetadata")
		default ConfigMapNameReference getOAuthMetadata() throws Exception { return null; }

		@YamlPropertyName(value="webhookTokenAuthenticators")
		default List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception { return null; }

	}

}
