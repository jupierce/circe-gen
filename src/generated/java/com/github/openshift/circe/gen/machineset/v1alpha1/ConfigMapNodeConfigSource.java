package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapNodeConfigSource extends Bean {

	@YamlPropertyName(value="namespace")
	String getNamespace() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="uid")
	String getUID() throws Exception;

	@YamlPropertyName(value="resourceVersion")
	String getResourceVersion() throws Exception;

	@YamlPropertyName(value="kubeletConfigKey")
	String getKubeletConfigKey() throws Exception;

	interface EZ extends ConfigMapNodeConfigSource {

		@YamlPropertyName(value="namespace")
		default String getNamespace() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="uid")
		default String getUID() throws Exception { return null; }

		@YamlPropertyName(value="resourceVersion")
		default String getResourceVersion() throws Exception { return null; }

		@YamlPropertyName(value="kubeletConfigKey")
		default String getKubeletConfigKey() throws Exception { return null; }

	}

}
