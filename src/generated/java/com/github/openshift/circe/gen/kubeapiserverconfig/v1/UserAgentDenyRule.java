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

}
