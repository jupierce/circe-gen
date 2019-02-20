package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ObjectReference extends Bean {

	@YamlPropertyName(value="kind")
	String getKind() throws Exception;

	@YamlPropertyName(value="namespace")
	String getNamespace() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="uid")
	String getUID() throws Exception;

	@YamlPropertyName(value="apiVersion")
	String getAPIVersion() throws Exception;

	@YamlPropertyName(value="resourceVersion")
	String getResourceVersion() throws Exception;

	@YamlPropertyName(value="fieldPath")
	String getFieldPath() throws Exception;

	interface EZ extends ObjectReference {

		@YamlPropertyName(value="kind")
		default String getKind() throws Exception { return null; }

		@YamlPropertyName(value="namespace")
		default String getNamespace() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="uid")
		default String getUID() throws Exception { return null; }

		@YamlPropertyName(value="apiVersion")
		default String getAPIVersion() throws Exception { return null; }

		@YamlPropertyName(value="resourceVersion")
		default String getResourceVersion() throws Exception { return null; }

		@YamlPropertyName(value="fieldPath")
		default String getFieldPath() throws Exception { return null; }

	}

}
