package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuthTemplates extends Bean {
	//json:login
	SecretNameReference getLogin() throws Exception;
	//json:providerSelection
	SecretNameReference getProviderSelection() throws Exception;
	//json:error
	SecretNameReference getError() throws Exception;
}
