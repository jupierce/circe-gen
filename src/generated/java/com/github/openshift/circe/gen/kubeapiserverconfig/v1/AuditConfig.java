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
	String getPolicyConfiguration() throws Exception;

	@YamlPropertyName(value="logFormat")
	String getLogFormat() throws Exception;

	@YamlPropertyName(value="webHookKubeConfig")
	String getWebHookKubeConfig() throws Exception;

	@YamlPropertyName(value="webHookMode")
	String getWebHookMode() throws Exception;

	interface EZ extends AuditConfig {

		default Boolean getEnabled() throws Exception { return null; }

		default String getAuditFilePath() throws Exception { return null; }

		default Long getMaximumFileRetentionDays() throws Exception { return null; }

		default Long getMaximumRetainedFiles() throws Exception { return null; }

		default Long getMaximumFileSizeMegabytes() throws Exception { return null; }

		default String getPolicyFile() throws Exception { return null; }

		default String getPolicyConfiguration() throws Exception { return null; }

		default String getLogFormat() throws Exception { return null; }

		default String getWebHookKubeConfig() throws Exception { return null; }

		default String getWebHookMode() throws Exception { return null; }

	}

}
