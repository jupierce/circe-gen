package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuthSpec extends Bean {
	//json:identityProviders
	List<IdentityProvider> getIdentityProviders() throws Exception;
	//json:tokenConfig
	TokenConfig getTokenConfig() throws Exception;
	//json:templates
	OAuthTemplates getTemplates() throws Exception;
}
