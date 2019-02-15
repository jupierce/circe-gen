package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
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

}
