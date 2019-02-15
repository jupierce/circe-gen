package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MasterAuthConfig extends Bean {
	@YamlPropertyName(value="requestHeader")
	RequestHeaderAuthenticationOptions getRequestHeader() throws Exception;

	@YamlPropertyName(value="webhookTokenAuthenticators")
	List<WebhookTokenAuthenticator> getWebhookTokenAuthenticators() throws Exception;

	@YamlPropertyName(value="oauthMetadataFile")
	String getOAuthMetadataFile() throws Exception;

}