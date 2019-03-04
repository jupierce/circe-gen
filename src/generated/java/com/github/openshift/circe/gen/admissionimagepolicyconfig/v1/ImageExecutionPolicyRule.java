// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.admissionimagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageExecutionPolicyRule extends Bean {

	@YamlPropertyName(value="imageCondition")
	@YamlPropertyInline
	ImageCondition getImageCondition() throws Exception;

	@YamlPropertyName(value="reject")
	Boolean getReject() throws Exception;

	interface EZ extends ImageExecutionPolicyRule {

		@YamlPropertyName(value="imageCondition")
		@YamlPropertyInline
		default ImageCondition getImageCondition() throws Exception { return null; }

		@YamlPropertyName(value="reject")
		default Boolean getReject() throws Exception { return null; }

	}

}
