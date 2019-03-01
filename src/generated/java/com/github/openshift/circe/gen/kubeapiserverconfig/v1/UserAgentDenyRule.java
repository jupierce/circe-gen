package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface UserAgentDenyRule extends Bean {

	@YamlPropertyName(value="userAgentMatchRule")
	@YamlPropertyInline
	UserAgentMatchRule getUserAgentMatchRule() throws Exception;

	@YamlPropertyName(value="rejectionMessage")
	String getRejectionMessage() throws Exception;

	interface EZ extends UserAgentDenyRule {

		@YamlPropertyName(value="userAgentMatchRule")
		@YamlPropertyInline
		default UserAgentMatchRule getUserAgentMatchRule() throws Exception { return null; }

		@YamlPropertyName(value="rejectionMessage")
		default String getRejectionMessage() throws Exception { return null; }

	}

}
