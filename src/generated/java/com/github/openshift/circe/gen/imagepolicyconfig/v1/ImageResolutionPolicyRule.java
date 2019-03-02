// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageResolutionPolicyRule extends Bean {

	@YamlPropertyName(value="policy")
	String getPolicy() throws Exception;

	@YamlPropertyName(value="targetResource")
	GroupResource getTargetResource() throws Exception;

	@YamlPropertyName(value="localNames")
	Boolean getLocalNames() throws Exception;

	interface EZ extends ImageResolutionPolicyRule {

		@YamlPropertyName(value="policy")
		default String getPolicy() throws Exception { return null; }

		@YamlPropertyName(value="targetResource")
		default GroupResource getTargetResource() throws Exception { return null; }

		@YamlPropertyName(value="localNames")
		default Boolean getLocalNames() throws Exception { return null; }

	}

}
