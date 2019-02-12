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

}
