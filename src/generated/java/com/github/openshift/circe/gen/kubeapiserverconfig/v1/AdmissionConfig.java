// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AdmissionConfig extends Bean {

	@YamlPropertyName(value="pluginConfig")
	Map<String,AdmissionPluginConfig> getPluginConfig() throws Exception;

	@YamlPropertyName(value="enabledPlugins")
	List<String> getEnabledAdmissionPlugins() throws Exception;

	@YamlPropertyName(value="disabledPlugins")
	List<String> getDisabledAdmissionPlugins() throws Exception;

	interface EZ extends AdmissionConfig {

		@YamlPropertyName(value="pluginConfig")
		default Map<String,AdmissionPluginConfig> getPluginConfig() throws Exception { return null; }

		@YamlPropertyName(value="enabledPlugins")
		default List<String> getEnabledAdmissionPlugins() throws Exception { return null; }

		@YamlPropertyName(value="disabledPlugins")
		default List<String> getDisabledAdmissionPlugins() throws Exception { return null; }

	}

}
