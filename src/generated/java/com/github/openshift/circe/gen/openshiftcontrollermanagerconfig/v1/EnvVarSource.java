// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EnvVarSource extends Bean {

	@YamlPropertyName(value="fieldRef")
	ObjectFieldSelector getFieldRef() throws Exception;

	@YamlPropertyName(value="resourceFieldRef")
	ResourceFieldSelector getResourceFieldRef() throws Exception;

	@YamlPropertyName(value="configMapKeyRef")
	ConfigMapKeySelector getConfigMapKeyRef() throws Exception;

	@YamlPropertyName(value="secretKeyRef")
	SecretKeySelector getSecretKeyRef() throws Exception;

	interface EZ extends EnvVarSource {

		@YamlPropertyName(value="fieldRef")
		default ObjectFieldSelector getFieldRef() throws Exception { return null; }

		@YamlPropertyName(value="resourceFieldRef")
		default ResourceFieldSelector getResourceFieldRef() throws Exception { return null; }

		@YamlPropertyName(value="configMapKeyRef")
		default ConfigMapKeySelector getConfigMapKeyRef() throws Exception { return null; }

		@YamlPropertyName(value="secretKeyRef")
		default SecretKeySelector getSecretKeyRef() throws Exception { return null; }

	}

}
