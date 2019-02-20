package com.github.openshift.circe.gen.authentication.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {

	@YamlPropertyName(value="kubeConfig")
	SecretNameReference getKubeConfig() throws Exception;

	interface EZ extends WebhookTokenAuthenticator {

		@YamlPropertyName(value="kubeConfig")
		default SecretNameReference getKubeConfig() throws Exception { return null; }

	}

}
