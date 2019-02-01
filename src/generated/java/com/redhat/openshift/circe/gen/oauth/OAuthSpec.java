package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuthSpec extends Bean {
	//json:identityProviders
	List<IdentityProvider> getIdentityProviders() throws Exception;
	//json:tokenConfig
	TokenConfig getTokenConfig() throws Exception;
	//json:templates
	OAuthTemplates getTemplates() throws Exception;
}
