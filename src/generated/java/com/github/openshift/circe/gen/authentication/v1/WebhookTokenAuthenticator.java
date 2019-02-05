package com.github.openshift.circe.gen.authentication.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {
	@YamlPropertyName(value="kubeConfig")
	SecretNameReference getKubeConfig() throws Exception;

}
