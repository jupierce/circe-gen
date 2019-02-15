package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface FrontProxyConfig extends Bean {

	@YamlPropertyName(value="clientCA")
	String getClientCA() throws Exception;

	@YamlPropertyName(value="allowedNames")
	List<String> getAllowedNames() throws Exception;

	@YamlPropertyName(value="usernameHeaders")
	List<String> getUsernameHeaders() throws Exception;

	@YamlPropertyName(value="groupHeaders")
	List<String> getGroupHeaders() throws Exception;

	@YamlPropertyName(value="extraHeaderPrefixes")
	List<String> getExtraHeaderPrefixes() throws Exception;

	interface EZ extends FrontProxyConfig {

		default String getClientCA() throws Exception { return null; }

		default List<String> getAllowedNames() throws Exception { return null; }

		default List<String> getUsernameHeaders() throws Exception { return null; }

		default List<String> getGroupHeaders() throws Exception { return null; }

		default List<String> getExtraHeaderPrefixes() throws Exception { return null; }

	}

}
