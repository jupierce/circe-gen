package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AdmissionPluginConfig extends Bean {

	@YamlPropertyName(value="location")
	String getLocation() throws Exception;

	@YamlPropertyName(value="configuration")
	String getConfiguration() throws Exception;

	interface EZ extends AdmissionPluginConfig {

		default String getLocation() throws Exception { return null; }

		default String getConfiguration() throws Exception { return null; }

	}

}
