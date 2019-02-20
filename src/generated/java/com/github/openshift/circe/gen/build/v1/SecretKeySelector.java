package com.github.openshift.circe.gen.build.v1;
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

		@YamlPropertyName(value="localObjectReference")
		@YamlPropertyInline
		default LocalObjectReference getLocalObjectReference() throws Exception { return null; }

		@YamlPropertyName(value="key")
		default String getKey() throws Exception { return null; }

		@YamlPropertyName(value="optional")
		default Boolean getOptional() throws Exception { return null; }

	}

}
