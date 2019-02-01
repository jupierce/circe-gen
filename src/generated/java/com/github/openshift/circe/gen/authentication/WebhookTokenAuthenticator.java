package com.github.openshift.circe.gen.authentication;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {
	//json:kubeConfig
	SecretNameReference getKubeConfig() throws Exception;
}
