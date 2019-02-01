package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuthTemplates extends Bean {
	//json:login
	SecretNameReference getLogin() throws Exception;
	//json:providerSelection
	SecretNameReference getProviderSelection() throws Exception;
	//json:error
	SecretNameReference getError() throws Exception;
}
