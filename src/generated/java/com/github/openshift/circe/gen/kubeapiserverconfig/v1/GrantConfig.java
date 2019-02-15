package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GrantConfig extends Bean {

	@YamlPropertyName(value="method")
	String getMethod() throws Exception;

	@YamlPropertyName(value="serviceAccountMethod")
	String getServiceAccountMethod() throws Exception;

	interface EZ extends GrantConfig {

		default String getMethod() throws Exception { return null; }

		default String getServiceAccountMethod() throws Exception { return null; }

	}

}
