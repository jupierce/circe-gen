package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BasicAuthIdentityProvider extends Bean {

	@YamlPropertyName(value="oAuthRemoteConnectionInfo")
	@YamlPropertyInline
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;

	interface EZ extends BasicAuthIdentityProvider {

		@YamlPropertyName(value="oAuthRemoteConnectionInfo")
		@YamlPropertyInline
		default OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception { return null; }

	}

}
