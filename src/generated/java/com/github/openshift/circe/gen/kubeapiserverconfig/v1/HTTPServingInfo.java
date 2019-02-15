package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface HTTPServingInfo extends Bean {

	@YamlPropertyName(value="servingInfo")
	@YamlPropertyInline
	ServingInfo getServingInfo() throws Exception;

	@YamlPropertyName(value="maxRequestsInFlight")
	Long getMaxRequestsInFlight() throws Exception;

	@YamlPropertyName(value="requestTimeoutSeconds")
	Long getRequestTimeoutSeconds() throws Exception;

	interface EZ extends HTTPServingInfo {

		default ServingInfo getServingInfo() throws Exception { return null; }

		default Long getMaxRequestsInFlight() throws Exception { return null; }

		default Long getRequestTimeoutSeconds() throws Exception { return null; }

	}

}
