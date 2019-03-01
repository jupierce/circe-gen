package com.github.openshift.circe.gen.projectrequestlimitconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProjectRequestLimitConfig extends Bean {

	default String getKind() { return "ProjectRequestLimitConfig"; }
	default String getApiVersion() { return "project.openshift.io/v1"; }
	@YamlPropertyName(value="limits")
	List<ProjectLimitBySelector> getLimits() throws Exception;

	@YamlPropertyName(value="maxProjectsForSystemUsers")
	Long getMaxProjectsForSystemUsers() throws Exception;

	@YamlPropertyName(value="maxProjectsForServiceAccounts")
	Long getMaxProjectsForServiceAccounts() throws Exception;

	interface EZ extends ProjectRequestLimitConfig {

		@YamlPropertyName(value="limits")
		default List<ProjectLimitBySelector> getLimits() throws Exception { return null; }

		@YamlPropertyName(value="maxProjectsForSystemUsers")
		default Long getMaxProjectsForSystemUsers() throws Exception { return null; }

		@YamlPropertyName(value="maxProjectsForServiceAccounts")
		default Long getMaxProjectsForServiceAccounts() throws Exception { return null; }

	}

}
