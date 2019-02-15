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

		default ObjectFieldSelector getFieldRef() throws Exception { return null; }

		default ResourceFieldSelector getResourceFieldRef() throws Exception { return null; }

		default ConfigMapKeySelector getConfigMapKeyRef() throws Exception { return null; }

		default SecretKeySelector getSecretKeyRef() throws Exception { return null; }

	}

}
