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

		default String getNamespace() throws Exception { return null; }

		default String getName() throws Exception { return null; }

		default String getUID() throws Exception { return null; }

		default String getResourceVersion() throws Exception { return null; }

		default String getKubeletConfigKey() throws Exception { return null; }

	}

}
