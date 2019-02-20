package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Rule extends Bean {

	@YamlPropertyName(value="apiGroups")
	List<String> getAPIGroups() throws Exception;

	@YamlPropertyName(value="apiVersions")
	List<String> getAPIVersions() throws Exception;

	@YamlPropertyName(value="resources")
	List<String> getResources() throws Exception;

	interface EZ extends Rule {

		@YamlPropertyName(value="apiGroups")
		default List<String> getAPIGroups() throws Exception { return null; }

		@YamlPropertyName(value="apiVersions")
		default List<String> getAPIVersions() throws Exception { return null; }

		@YamlPropertyName(value="resources")
		default List<String> getResources() throws Exception { return null; }

	}

}
