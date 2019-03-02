// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.projectrequestlimitconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProjectLimitBySelector extends Bean {

	@YamlPropertyName(value="selector")
	Map<String,String> getSelector() throws Exception;

	@YamlPropertyName(value="maxProjects")
	Long getMaxProjects() throws Exception;

	interface EZ extends ProjectLimitBySelector {

		@YamlPropertyName(value="selector")
		default Map<String,String> getSelector() throws Exception { return null; }

		@YamlPropertyName(value="maxProjects")
		default Long getMaxProjects() throws Exception { return null; }

	}

}
