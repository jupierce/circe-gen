package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerConfig extends Bean {

	default String getKind() { return "KubeAPIServerConfig"; }
	default String getApiVersion() { return "kubecontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="genericAPIServerConfig")
	@YamlPropertyInline
	GenericAPIServerConfig getGenericAPIServerConfig() throws Exception;

	@YamlPropertyName(value="authConfig")
	MasterAuthConfig getAuthConfig() throws Exception;

	@YamlPropertyName(value="aggregatorConfig")
	AggregatorConfig getAggregatorConfig() throws Exception;

	@YamlPropertyName(value="kubeletClientInfo")
	KubeletConnectionInfo getKubeletClientInfo() throws Exception;

	@YamlPropertyName(value="servicesSubnet")
	String getServicesSubnet() throws Exception;

	@YamlPropertyName(value="servicesNodePortRange")
	String getServicesNodePortRange() throws Exception;

	@YamlPropertyName(value="consolePublicURL")
	String getConsolePublicURL() throws Exception;

	@YamlPropertyName(value="userAgentMatchingConfig")
	UserAgentMatchingConfig getUserAgentMatchingConfig() throws Exception;

	@YamlPropertyName(value="imagePolicyConfig")
	KubeAPIServerImagePolicyConfig getImagePolicyConfig() throws Exception;

	@YamlPropertyName(value="projectConfig")
	KubeAPIServerProjectConfig getProjectConfig() throws Exception;

	@YamlPropertyName(value="serviceAccountPublicKeyFiles")
	List<String> getServiceAccountPublicKeyFiles() throws Exception;

	@YamlPropertyName(value="oauthConfig")
	OAuthConfig getOAuthConfig() throws Exception;

	@YamlPropertyName(value="apiServerArguments")
	Map<String,List<String>> getAPIServerArguments() throws Exception;

	interface EZ extends KubeAPIServerConfig {

		@YamlPropertyName(value="genericAPIServerConfig")
		@YamlPropertyInline
		default GenericAPIServerConfig getGenericAPIServerConfig() throws Exception { return null; }

		@YamlPropertyName(value="authConfig")
		default MasterAuthConfig getAuthConfig() throws Exception { return null; }

		@YamlPropertyName(value="aggregatorConfig")
		default AggregatorConfig getAggregatorConfig() throws Exception { return null; }

		@YamlPropertyName(value="kubeletClientInfo")
		default KubeletConnectionInfo getKubeletClientInfo() throws Exception { return null; }

		@YamlPropertyName(value="servicesSubnet")
		default String getServicesSubnet() throws Exception { return null; }

		@YamlPropertyName(value="servicesNodePortRange")
		default String getServicesNodePortRange() throws Exception { return null; }

		@YamlPropertyName(value="consolePublicURL")
		default String getConsolePublicURL() throws Exception { return null; }

		@YamlPropertyName(value="userAgentMatchingConfig")
		default UserAgentMatchingConfig getUserAgentMatchingConfig() throws Exception { return null; }

		@YamlPropertyName(value="imagePolicyConfig")
		default KubeAPIServerImagePolicyConfig getImagePolicyConfig() throws Exception { return null; }

		@YamlPropertyName(value="projectConfig")
		default KubeAPIServerProjectConfig getProjectConfig() throws Exception { return null; }

		@YamlPropertyName(value="serviceAccountPublicKeyFiles")
		default List<String> getServiceAccountPublicKeyFiles() throws Exception { return null; }

		@YamlPropertyName(value="oauthConfig")
		default OAuthConfig getOAuthConfig() throws Exception { return null; }

		@YamlPropertyName(value="apiServerArguments")
		default Map<String,List<String>> getAPIServerArguments() throws Exception { return null; }

	}

}
