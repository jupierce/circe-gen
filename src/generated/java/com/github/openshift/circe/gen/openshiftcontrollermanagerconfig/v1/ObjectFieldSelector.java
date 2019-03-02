// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ObjectFieldSelector extends Bean {

	@YamlPropertyName(value="apiVersion")
	String getAPIVersion() throws Exception;

	@YamlPropertyName(value="fieldPath")
	String getFieldPath() throws Exception;

	interface EZ extends ObjectFieldSelector {

		@YamlPropertyName(value="apiVersion")
		default String getAPIVersion() throws Exception { return null; }

		@YamlPropertyName(value="fieldPath")
		default String getFieldPath() throws Exception { return null; }

	}

}
