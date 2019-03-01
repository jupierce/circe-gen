package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RoutingConfig extends Bean {

	@YamlPropertyName(value="subdomain")
	String getSubdomain() throws Exception;

	interface EZ extends RoutingConfig {

		@YamlPropertyName(value="subdomain")
		default String getSubdomain() throws Exception { return null; }

	}

}
