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

		default String getAPIVersion() throws Exception { return null; }

		default String getFieldPath() throws Exception { return null; }

	}

}
