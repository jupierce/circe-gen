// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.admissionimagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageCondition extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="ignoreNamespaceOverride")
	Boolean getIgnoreNamespaceOverride() throws Exception;

	@YamlPropertyName(value="onResources")
	List<GroupResource> getOnResources() throws Exception;

	@YamlPropertyName(value="invertMatch")
	Boolean getInvertMatch() throws Exception;

	@YamlPropertyName(value="matchIntegratedRegistry")
	Boolean getMatchIntegratedRegistry() throws Exception;

	@YamlPropertyName(value="matchRegistries")
	List<String> getMatchRegistries() throws Exception;

	@YamlPropertyName(value="skipOnResolutionFailure")
	Boolean getSkipOnResolutionFailure() throws Exception;

	@YamlPropertyName(value="matchDockerImageLabels")
	List<ValueCondition> getMatchDockerImageLabels() throws Exception;

	@YamlPropertyName(value="matchImageLabels")
	List<LabelSelector> getMatchImageLabels() throws Exception;

	@YamlPropertyName(value="matchImageAnnotations")
	List<ValueCondition> getMatchImageAnnotations() throws Exception;

	interface EZ extends ImageCondition {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="ignoreNamespaceOverride")
		default Boolean getIgnoreNamespaceOverride() throws Exception { return null; }

		@YamlPropertyName(value="onResources")
		default List<GroupResource> getOnResources() throws Exception { return null; }

		@YamlPropertyName(value="invertMatch")
		default Boolean getInvertMatch() throws Exception { return null; }

		@YamlPropertyName(value="matchIntegratedRegistry")
		default Boolean getMatchIntegratedRegistry() throws Exception { return null; }

		@YamlPropertyName(value="matchRegistries")
		default List<String> getMatchRegistries() throws Exception { return null; }

		@YamlPropertyName(value="skipOnResolutionFailure")
		default Boolean getSkipOnResolutionFailure() throws Exception { return null; }

		@YamlPropertyName(value="matchDockerImageLabels")
		default List<ValueCondition> getMatchDockerImageLabels() throws Exception { return null; }

		@YamlPropertyName(value="matchImageLabels")
		default List<LabelSelector> getMatchImageLabels() throws Exception { return null; }

		@YamlPropertyName(value="matchImageAnnotations")
		default List<ValueCondition> getMatchImageAnnotations() throws Exception { return null; }

	}

}
