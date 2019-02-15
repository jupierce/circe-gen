package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildDefaultsConfig extends Bean {
	default String getKind() { return "BuildDefaultsConfig"; }
	default String getApiVersion() { return "openshiftcontrolplane.config.openshift.io/v1"; }
	@YamlPropertyName(value="gitHTTPProxy")
	String getGitHTTPProxy() throws Exception;

	@YamlPropertyName(value="gitHTTPSProxy")
	String getGitHTTPSProxy() throws Exception;

	@YamlPropertyName(value="gitNoProxy")
	String getGitNoProxy() throws Exception;

	@YamlPropertyName(value="env")
	List<EnvVar> getEnv() throws Exception;

	@YamlPropertyName(value="sourceStrategyDefaults")
	SourceStrategyDefaultsConfig getSourceStrategyDefaults() throws Exception;

	@YamlPropertyName(value="imageLabels")
	List<ImageLabel> getImageLabels() throws Exception;

	@YamlPropertyName(value="nodeSelector")
	Map<String,String> getNodeSelector() throws Exception;

	@YamlPropertyName(value="annotations")
	Map<String,String> getAnnotations() throws Exception;

	@YamlPropertyName(value="resources")
	ResourceRequirements getResources() throws Exception;

}
