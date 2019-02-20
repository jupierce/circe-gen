package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface WebhookClientConfig extends Bean {

	@YamlPropertyName(value="url")
	String getURL() throws Exception;

	@YamlPropertyName(value="service")
	ServiceReference getService() throws Exception;

	@YamlPropertyName(value="caBundle")
	List<Long> getCABundle() throws Exception;

	interface EZ extends WebhookClientConfig {

		default String getURL() throws Exception { return null; }

		default ServiceReference getService() throws Exception { return null; }

		default List<Long> getCABundle() throws Exception { return null; }

	}

}
