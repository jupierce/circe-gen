package com.github.openshift.circe.gen.builddefaultsconfig.v1;
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

	interface EZ extends BuildDefaultsConfig {

		default String getGitHTTPProxy() throws Exception { return null; }

		default String getGitHTTPSProxy() throws Exception { return null; }

		default String getGitNoProxy() throws Exception { return null; }

		default List<EnvVar> getEnv() throws Exception { return null; }

		default SourceStrategyDefaultsConfig getSourceStrategyDefaults() throws Exception { return null; }

		default List<ImageLabel> getImageLabels() throws Exception { return null; }

		default Map<String,String> getNodeSelector() throws Exception { return null; }

		default Map<String,String> getAnnotations() throws Exception { return null; }

		default ResourceRequirements getResources() throws Exception { return null; }

	}

}
