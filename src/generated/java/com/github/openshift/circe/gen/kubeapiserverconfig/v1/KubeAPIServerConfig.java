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

}
