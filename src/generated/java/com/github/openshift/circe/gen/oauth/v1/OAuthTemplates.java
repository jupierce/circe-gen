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

}
