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

	interface EZ extends OpenShiftControllerManagerConfig {

		@YamlPropertyName(value="kubeClientConfig")
		default KubeClientConfig getKubeClientConfig() throws Exception { return null; }

		@YamlPropertyName(value="servingInfo")
		default HTTPServingInfo getServingInfo() throws Exception { return null; }

		@YamlPropertyName(value="leaderElection")
		default LeaderElection getLeaderElection() throws Exception { return null; }

		@YamlPropertyName(value="controllers")
		default List<String> getControllers() throws Exception { return null; }

		@YamlPropertyName(value="resourceQuota")
		default ResourceQuotaControllerConfig getResourceQuota() throws Exception { return null; }

		@YamlPropertyName(value="serviceServingCert")
		default ServiceServingCert getServiceServingCert() throws Exception { return null; }

		@YamlPropertyName(value="deployer")
		default DeployerControllerConfig getDeployer() throws Exception { return null; }

		@YamlPropertyName(value="build")
		default BuildControllerConfig getBuild() throws Exception { return null; }

		@YamlPropertyName(value="serviceAccount")
		default ServiceAccountControllerConfig getServiceAccount() throws Exception { return null; }

		@YamlPropertyName(value="dockerPullSecret")
		default DockerPullSecretControllerConfig getDockerPullSecret() throws Exception { return null; }

		@YamlPropertyName(value="network")
		default NetworkControllerConfig getNetwork() throws Exception { return null; }

		@YamlPropertyName(value="ingress")
		default IngressControllerConfig getIngress() throws Exception { return null; }

		@YamlPropertyName(value="imageImport")
		default ImageImportControllerConfig getImageImport() throws Exception { return null; }

		@YamlPropertyName(value="securityAllocator")
		default SecurityAllocator getSecurityAllocator() throws Exception { return null; }

	}

}
