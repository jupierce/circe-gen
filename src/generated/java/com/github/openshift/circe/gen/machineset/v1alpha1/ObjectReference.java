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

		default String getKind() throws Exception { return null; }

		default String getNamespace() throws Exception { return null; }

		default String getName() throws Exception { return null; }

		default String getUID() throws Exception { return null; }

		default String getAPIVersion() throws Exception { return null; }

		default String getResourceVersion() throws Exception { return null; }

		default String getFieldPath() throws Exception { return null; }

	}

}
