package com.redhat.openshift.circe.gen.authentication;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {
	//json:kubeConfig
	SecretNameReference getKubeConfig() throws Exception;
}
