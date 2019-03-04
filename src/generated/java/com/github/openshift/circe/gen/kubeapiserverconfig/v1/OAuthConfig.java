// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthConfig extends Bean {

	@YamlPropertyName(value="masterCA")
	String getMasterCA() throws Exception;

	@YamlPropertyName(value="masterURL")
	String getMasterURL() throws Exception;

	@YamlPropertyName(value="masterPublicURL")
	String getMasterPublicURL() throws Exception;

	@YamlPropertyName(value="loginURL")
	String getLoginURL() throws Exception;

	@YamlPropertyName(value="assetPublicURL")
	String getAssetPublicURL() throws Exception;

	@YamlPropertyName(value="alwaysShowProviderSelection")
	Boolean getAlwaysShowProviderSelection() throws Exception;

	@YamlPropertyName(value="identityProviders")
	List<IdentityProvider> getIdentityProviders() throws Exception;

	@YamlPropertyName(value="grantConfig")
	GrantConfig getGrantConfig() throws Exception;

	@YamlPropertyName(value="sessionConfig")
	SessionConfig getSessionConfig() throws Exception;

	@YamlPropertyName(value="tokenConfig")
	TokenConfig getTokenConfig() throws Exception;

	@YamlPropertyName(value="templates")
	OAuthTemplates getTemplates() throws Exception;

	interface EZ extends OAuthConfig {

		@YamlPropertyName(value="masterCA")
		default String getMasterCA() throws Exception { return null; }

		@YamlPropertyName(value="masterURL")
		default String getMasterURL() throws Exception { return null; }

		@YamlPropertyName(value="masterPublicURL")
		default String getMasterPublicURL() throws Exception { return null; }

		@YamlPropertyName(value="loginURL")
		default String getLoginURL() throws Exception { return null; }

		@YamlPropertyName(value="assetPublicURL")
		default String getAssetPublicURL() throws Exception { return null; }

		@YamlPropertyName(value="alwaysShowProviderSelection")
		default Boolean getAlwaysShowProviderSelection() throws Exception { return null; }

		@YamlPropertyName(value="identityProviders")
		default List<IdentityProvider> getIdentityProviders() throws Exception { return null; }

		@YamlPropertyName(value="grantConfig")
		default GrantConfig getGrantConfig() throws Exception { return null; }

		@YamlPropertyName(value="sessionConfig")
		default SessionConfig getSessionConfig() throws Exception { return null; }

		@YamlPropertyName(value="tokenConfig")
		default TokenConfig getTokenConfig() throws Exception { return null; }

		@YamlPropertyName(value="templates")
		default OAuthTemplates getTemplates() throws Exception { return null; }

	}

}
