// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImagePolicyConfig extends Bean {

	default String getKind() { return "ImagePolicyConfig"; }
	default String getApiVersion() { return "image.openshift.io/v1"; }
	@YamlPropertyName(value="resolveImages")
	String getResolveImages() throws Exception;

	@YamlPropertyName(value="resolutionRules")
	List<ImageResolutionPolicyRule> getResolutionRules() throws Exception;

	@YamlPropertyName(value="executionRules")
	List<ImageExecutionPolicyRule> getExecutionRules() throws Exception;

	interface EZ extends ImagePolicyConfig {

		@YamlPropertyName(value="resolveImages")
		default String getResolveImages() throws Exception { return null; }

		@YamlPropertyName(value="resolutionRules")
		default List<ImageResolutionPolicyRule> getResolutionRules() throws Exception { return null; }

		@YamlPropertyName(value="executionRules")
		default List<ImageExecutionPolicyRule> getExecutionRules() throws Exception { return null; }

	}

}
