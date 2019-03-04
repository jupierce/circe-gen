// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GenericAPIServerConfig extends Bean {

	@YamlPropertyName(value="servingInfo")
	HTTPServingInfo getServingInfo() throws Exception;

	@YamlPropertyName(value="corsAllowedOrigins")
	List<String> getCORSAllowedOrigins() throws Exception;

	@YamlPropertyName(value="auditConfig")
	AuditConfig getAuditConfig() throws Exception;

	@YamlPropertyName(value="storageConfig")
	EtcdStorageConfig getStorageConfig() throws Exception;

	@YamlPropertyName(value="admission")
	AdmissionConfig getAdmissionConfig() throws Exception;

	@YamlPropertyName(value="admissionPluginConfig")
	Map<String,AdmissionPluginConfig> getAdmissionPluginConfig() throws Exception;

	@YamlPropertyName(value="kubeClientConfig")
	KubeClientConfig getKubeClientConfig() throws Exception;

	interface EZ extends GenericAPIServerConfig {

		@YamlPropertyName(value="servingInfo")
		default HTTPServingInfo getServingInfo() throws Exception { return null; }

		@YamlPropertyName(value="corsAllowedOrigins")
		default List<String> getCORSAllowedOrigins() throws Exception { return null; }

		@YamlPropertyName(value="auditConfig")
		default AuditConfig getAuditConfig() throws Exception { return null; }

		@YamlPropertyName(value="storageConfig")
		default EtcdStorageConfig getStorageConfig() throws Exception { return null; }

		@YamlPropertyName(value="admission")
		default AdmissionConfig getAdmissionConfig() throws Exception { return null; }

		@YamlPropertyName(value="admissionPluginConfig")
		default Map<String,AdmissionPluginConfig> getAdmissionPluginConfig() throws Exception { return null; }

		@YamlPropertyName(value="kubeClientConfig")
		default KubeClientConfig getKubeClientConfig() throws Exception { return null; }

	}

}
