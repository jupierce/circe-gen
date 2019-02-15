package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthTemplates extends Bean {

	@YamlPropertyName(value="login")
	SecretNameReference getLogin() throws Exception;

	@YamlPropertyName(value="providerSelection")
	SecretNameReference getProviderSelection() throws Exception;

	@YamlPropertyName(value="error")
	SecretNameReference getError() throws Exception;

	interface EZ extends OAuthTemplates {

		default SecretNameReference getLogin() throws Exception { return null; }

		default SecretNameReference getProviderSelection() throws Exception { return null; }

		default SecretNameReference getError() throws Exception { return null; }

	}

}
