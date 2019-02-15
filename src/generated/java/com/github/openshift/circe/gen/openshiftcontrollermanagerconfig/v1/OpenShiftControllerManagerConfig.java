package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftControllerManagerConfig extends Bean {
	default String getKind() { return "OpenShiftControllerManagerConfig"; }
	default String getApiVersion() { return "openshiftcontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="kubeClientConfig")
	KubeClientConfig getKubeClientConfig() throws Exception;

	@YamlPropertyName(value="servingInfo")
	HTTPServingInfo getServingInfo() throws Exception;

	@YamlPropertyName(value="leaderElection")
	LeaderElection getLeaderElection() throws Exception;

	@YamlPropertyName(value="controllers")
	List<String> getControllers() throws Exception;

	@YamlPropertyName(value="resourceQuota")
	ResourceQuotaControllerConfig getResourceQuota() throws Exception;

	@YamlPropertyName(value="serviceServingCert")
	ServiceServingCert getServiceServingCert() throws Exception;

	@YamlPropertyName(value="deployer")
	DeployerControllerConfig getDeployer() throws Exception;

	@YamlPropertyName(value="build")
	BuildControllerConfig getBuild() throws Exception;

	@YamlPropertyName(value="serviceAccount")
	ServiceAccountControllerConfig getServiceAccount() throws Exception;

	@YamlPropertyName(value="dockerPullSecret")
	DockerPullSecretControllerConfig getDockerPullSecret() throws Exception;

	@YamlPropertyName(value="network")
	NetworkControllerConfig getNetwork() throws Exception;

	@YamlPropertyName(value="ingress")
	IngressControllerConfig getIngress() throws Exception;

	@YamlPropertyName(value="imageImport")
	ImageImportControllerConfig getImageImport() throws Exception;

	@YamlPropertyName(value="securityAllocator")
	SecurityAllocator getSecurityAllocator() throws Exception;

}
