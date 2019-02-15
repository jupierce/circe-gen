package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SecretKeySelector extends Bean {

	@YamlPropertyName(value="localObjectReference")
	@YamlPropertyInline
	LocalObjectReference getLocalObjectReference() throws Exception;

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="optional")
	Boolean getOptional() throws Exception;

	interface EZ extends SecretKeySelector {

		default LocalObjectReference getLocalObjectReference() throws Exception { return null; }

		default String getKey() throws Exception { return null; }

		default Boolean getOptional() throws Exception { return null; }

	}

}
