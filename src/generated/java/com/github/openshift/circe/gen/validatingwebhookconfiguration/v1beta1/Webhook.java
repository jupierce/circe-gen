package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Webhook extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="clientConfig")
	WebhookClientConfig getClientConfig() throws Exception;

	@YamlPropertyName(value="rules")
	List<RuleWithOperations> getRules() throws Exception;

	@YamlPropertyName(value="failurePolicy")
	String getFailurePolicy() throws Exception;

	@YamlPropertyName(value="namespaceSelector")
	LabelSelector getNamespaceSelector() throws Exception;

	@YamlPropertyName(value="sideEffects")
	String getSideEffects() throws Exception;

	interface EZ extends Webhook {

		default String getName() throws Exception { return null; }

		default WebhookClientConfig getClientConfig() throws Exception { return null; }

		default List<RuleWithOperations> getRules() throws Exception { return null; }

		default String getFailurePolicy() throws Exception { return null; }

		default LabelSelector getNamespaceSelector() throws Exception { return null; }

		default String getSideEffects() throws Exception { return null; }

	}

}
