package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IngressControllerConfig extends Bean {

	@YamlPropertyName(value="ingressIPNetworkCIDR")
	String getIngressIPNetworkCIDR() throws Exception;

	interface EZ extends IngressControllerConfig {

		@YamlPropertyName(value="ingressIPNetworkCIDR")
		default String getIngressIPNetworkCIDR() throws Exception { return null; }

	}

}
