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

		default KubeClientConfig getKubeClientConfig() throws Exception { return null; }

		default HTTPServingInfo getServingInfo() throws Exception { return null; }

		default LeaderElection getLeaderElection() throws Exception { return null; }

		default List<String> getControllers() throws Exception { return null; }

		default ResourceQuotaControllerConfig getResourceQuota() throws Exception { return null; }

		default ServiceServingCert getServiceServingCert() throws Exception { return null; }

		default DeployerControllerConfig getDeployer() throws Exception { return null; }

		default BuildControllerConfig getBuild() throws Exception { return null; }

		default ServiceAccountControllerConfig getServiceAccount() throws Exception { return null; }

		default DockerPullSecretControllerConfig getDockerPullSecret() throws Exception { return null; }

		default NetworkControllerConfig getNetwork() throws Exception { return null; }

		default IngressControllerConfig getIngress() throws Exception { return null; }

		default ImageImportControllerConfig getImageImport() throws Exception { return null; }

		default SecurityAllocator getSecurityAllocator() throws Exception { return null; }

	}

}
