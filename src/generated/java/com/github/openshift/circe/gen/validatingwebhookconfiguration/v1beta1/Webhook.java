// GENERATED FILE -- DO NOT ALTER (circe.go)

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

	@YamlPropertyName(value="timeoutSeconds")
	Long getTimeoutSeconds() throws Exception;

	@YamlPropertyName(value="admissionReviewVersions")
	List<String> getAdmissionReviewVersions() throws Exception;

	interface EZ extends Webhook {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="clientConfig")
		default WebhookClientConfig getClientConfig() throws Exception { return null; }

		@YamlPropertyName(value="rules")
		default List<RuleWithOperations> getRules() throws Exception { return null; }

		@YamlPropertyName(value="failurePolicy")
		default String getFailurePolicy() throws Exception { return null; }

		@YamlPropertyName(value="namespaceSelector")
		default LabelSelector getNamespaceSelector() throws Exception { return null; }

		@YamlPropertyName(value="sideEffects")
		default String getSideEffects() throws Exception { return null; }

		@YamlPropertyName(value="timeoutSeconds")
		default Long getTimeoutSeconds() throws Exception { return null; }

		@YamlPropertyName(value="admissionReviewVersions")
		default List<String> getAdmissionReviewVersions() throws Exception { return null; }

	}

}
