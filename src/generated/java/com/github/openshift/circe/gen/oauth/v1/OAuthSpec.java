package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthSpec extends Bean {
	@YamlPropertyName(value="identityProviders")
	List<IdentityProvider> getIdentityProviders() throws Exception;

	@YamlPropertyName(value="tokenConfig")
	TokenConfig getTokenConfig() throws Exception;

	@YamlPropertyName(value="templates")
	OAuthTemplates getTemplates() throws Exception;

}
