// GENERATED FILE -- DO NOT ALTER (circe.go)

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

		@YamlPropertyName(value="clientCA")
		default String getClientCA() throws Exception { return null; }

		@YamlPropertyName(value="clientCommonNames")
		default List<String> getClientCommonNames() throws Exception { return null; }

		@YamlPropertyName(value="usernameHeaders")
		default List<String> getUsernameHeaders() throws Exception { return null; }

		@YamlPropertyName(value="groupHeaders")
		default List<String> getGroupHeaders() throws Exception { return null; }

		@YamlPropertyName(value="extraHeaderPrefixes")
		default List<String> getExtraHeaderPrefixes() throws Exception { return null; }

	}

}
