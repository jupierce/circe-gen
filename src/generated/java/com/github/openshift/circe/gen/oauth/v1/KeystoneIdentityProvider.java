package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KeystoneIdentityProvider extends Bean {

	@YamlPropertyName(value="oAuthRemoteConnectionInfo")
	@YamlPropertyInline
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;

	@YamlPropertyName(value="domainName")
	String getDomainName() throws Exception;

	interface EZ extends KeystoneIdentityProvider {

		@YamlPropertyName(value="oAuthRemoteConnectionInfo")
		@YamlPropertyInline
		default OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception { return null; }

		@YamlPropertyName(value="domainName")
		default String getDomainName() throws Exception { return null; }

	}

}
