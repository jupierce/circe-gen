// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
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

		@YamlPropertyName(value="servingInfo")
		@YamlPropertyInline
		default ServingInfo getServingInfo() throws Exception { return null; }

		@YamlPropertyName(value="maxRequestsInFlight")
		default Long getMaxRequestsInFlight() throws Exception { return null; }

		@YamlPropertyName(value="requestTimeoutSeconds")
		default Long getRequestTimeoutSeconds() throws Exception { return null; }

	}

}
