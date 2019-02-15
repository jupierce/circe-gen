package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RequestHeaderAuthenticationOptions extends Bean {

	@YamlPropertyName(value="clientCA")
	String getClientCA() throws Exception;

	@YamlPropertyName(value="clientCommonNames")
	List<String> getClientCommonNames() throws Exception;

	@YamlPropertyName(value="usernameHeaders")
	List<String> getUsernameHeaders() throws Exception;

	@YamlPropertyName(value="groupHeaders")
	List<String> getGroupHeaders() throws Exception;

	@YamlPropertyName(value="extraHeaderPrefixes")
	List<String> getExtraHeaderPrefixes() throws Exception;

	interface EZ extends RequestHeaderAuthenticationOptions {

		default String getClientCA() throws Exception { return null; }

		default List<String> getClientCommonNames() throws Exception { return null; }

		default List<String> getUsernameHeaders() throws Exception { return null; }

		default List<String> getGroupHeaders() throws Exception { return null; }

		default List<String> getExtraHeaderPrefixes() throws Exception { return null; }

	}

}
