package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ValidatingWebhookConfiguration extends Bean {

	default String getKind() { return "ValidatingWebhookConfiguration"; }
	default String getApiVersion() { return "admissionregistration.k8s.io/v1beta1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return ""; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="webhooks")
	List<Webhook> getWebhooks() throws Exception;

	interface EZ extends ValidatingWebhookConfiguration {

		default List<Webhook> getWebhooks() throws Exception { return null; }

	}

}
