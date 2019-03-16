// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.ingresscontrolleroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EndpointPublishingStrategy extends Bean {

	@YamlPropertyName(value="type")
	String getType() throws Exception;

	interface EZ extends EndpointPublishingStrategy {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

	}

}
