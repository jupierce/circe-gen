// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildDefaults extends Bean {

	@YamlPropertyName(value="defaultProxy")
	ProxySpec getDefaultProxy() throws Exception;

	@YamlPropertyName(value="gitProxy")
	ProxySpec getGitProxy() throws Exception;

	@YamlPropertyName(value="env")
	List<EnvVar> getEnv() throws Exception;

	@YamlPropertyName(value="imageLabels")
	List<ImageLabel> getImageLabels() throws Exception;

	@YamlPropertyName(value="resources")
	ResourceRequirements getResources() throws Exception;

	interface EZ extends BuildDefaults {

		@YamlPropertyName(value="defaultProxy")
		default ProxySpec getDefaultProxy() throws Exception { return null; }

		@YamlPropertyName(value="gitProxy")
		default ProxySpec getGitProxy() throws Exception { return null; }

		@YamlPropertyName(value="env")
		default List<EnvVar> getEnv() throws Exception { return null; }

		@YamlPropertyName(value="imageLabels")
		default List<ImageLabel> getImageLabels() throws Exception { return null; }

		@YamlPropertyName(value="resources")
		default ResourceRequirements getResources() throws Exception { return null; }

	}

}
