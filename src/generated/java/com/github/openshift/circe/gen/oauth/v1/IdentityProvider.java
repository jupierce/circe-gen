package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProvider extends Bean {
	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="challenge")
	Boolean getUseAsChallenger() throws Exception;

	@YamlPropertyName(value="login")
	Boolean getUseAsLogin() throws Exception;

	@YamlPropertyName(value="mappingMethod")
	String getMappingMethod() throws Exception;

	@YamlPropertyName(value="identityProviderConfig")
	@YamlPropertyInline
	IdentityProviderConfig getIdentityProviderConfig() throws Exception;

}
