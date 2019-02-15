package com.github.openshift.circe.gen.builddefaultsconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapKeySelector extends Bean {

	@YamlPropertyName(value="localObjectReference")
	@YamlPropertyInline
	LocalObjectReference getLocalObjectReference() throws Exception;

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="optional")
	Boolean getOptional() throws Exception;

	interface EZ extends ConfigMapKeySelector {

		default LocalObjectReference getLocalObjectReference() throws Exception { return null; }

		default String getKey() throws Exception { return null; }

		default Boolean getOptional() throws Exception { return null; }

	}

}
