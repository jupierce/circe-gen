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

	@YamlPropertyName(value="registriesConfig")
	RegistriesConfig getRegistriesConfig() throws Exception;

}
