package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AuditConfig extends Bean {

	@YamlPropertyName(value="enabled")
	Boolean getEnabled() throws Exception;

	@YamlPropertyName(value="auditFilePath")
	String getAuditFilePath() throws Exception;

	@YamlPropertyName(value="maximumFileRetentionDays")
	Long getMaximumFileRetentionDays() throws Exception;

	@YamlPropertyName(value="maximumRetainedFiles")
	Long getMaximumRetainedFiles() throws Exception;

	@YamlPropertyName(value="maximumFileSizeMegabytes")
	Long getMaximumFileSizeMegabytes() throws Exception;

	@YamlPropertyName(value="policyFile")
	String getPolicyFile() throws Exception;

	@YamlPropertyName(value="policyConfiguration")
	Bean getPolicyConfiguration() throws Exception;

	@YamlPropertyName(value="logFormat")
	String getLogFormat() throws Exception;

	@YamlPropertyName(value="webHookKubeConfig")
	String getWebHookKubeConfig() throws Exception;

	@YamlPropertyName(value="webHookMode")
	String getWebHookMode() throws Exception;

	interface EZ extends AuditConfig {

		@YamlPropertyName(value="enabled")
		default Boolean getEnabled() throws Exception { return null; }

		@YamlPropertyName(value="auditFilePath")
		default String getAuditFilePath() throws Exception { return null; }

		@YamlPropertyName(value="maximumFileRetentionDays")
		default Long getMaximumFileRetentionDays() throws Exception { return null; }

		@YamlPropertyName(value="maximumRetainedFiles")
		default Long getMaximumRetainedFiles() throws Exception { return null; }

		@YamlPropertyName(value="maximumFileSizeMegabytes")
		default Long getMaximumFileSizeMegabytes() throws Exception { return null; }

		@YamlPropertyName(value="policyFile")
		default String getPolicyFile() throws Exception { return null; }

		@YamlPropertyName(value="policyConfiguration")
		default Bean getPolicyConfiguration() throws Exception { return null; }

		@YamlPropertyName(value="logFormat")
		default String getLogFormat() throws Exception { return null; }

		@YamlPropertyName(value="webHookKubeConfig")
		default String getWebHookKubeConfig() throws Exception { return null; }

		@YamlPropertyName(value="webHookMode")
		default String getWebHookMode() throws Exception { return null; }

	}

}
