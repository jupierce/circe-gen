package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RegistryLocation extends Bean {
	@YamlPropertyName(value="domainName")
	String getDomainName() throws Exception;

	@YamlPropertyName(value="insecure")
	Boolean getInsecure() throws Exception;

}
