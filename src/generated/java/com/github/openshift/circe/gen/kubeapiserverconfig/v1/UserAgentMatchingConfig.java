package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface UserAgentMatchingConfig extends Bean {

	@YamlPropertyName(value="requiredClients")
	List<UserAgentMatchRule> getRequiredClients() throws Exception;

	@YamlPropertyName(value="deniedClients")
	List<UserAgentDenyRule> getDeniedClients() throws Exception;

	@YamlPropertyName(value="defaultRejectionMessage")
	String getDefaultRejectionMessage() throws Exception;

	interface EZ extends UserAgentMatchingConfig {

		default List<UserAgentMatchRule> getRequiredClients() throws Exception { return null; }

		default List<UserAgentDenyRule> getDeniedClients() throws Exception { return null; }

		default String getDefaultRejectionMessage() throws Exception { return null; }

	}

}
