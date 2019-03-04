// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RegistryLocation extends Bean {

	@YamlPropertyName(value="domainName")
	String getDomainName() throws Exception;

	@YamlPropertyName(value="insecure")
	Boolean getInsecure() throws Exception;

	interface EZ extends RegistryLocation {

		@YamlPropertyName(value="domainName")
		default String getDomainName() throws Exception { return null; }

		@YamlPropertyName(value="insecure")
		default Boolean getInsecure() throws Exception { return null; }

	}

}
