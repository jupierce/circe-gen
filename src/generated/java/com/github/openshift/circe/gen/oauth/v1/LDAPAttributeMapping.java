// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LDAPAttributeMapping extends Bean {

	@YamlPropertyName(value="id")
	List<String> getID() throws Exception;

	@YamlPropertyName(value="preferredUsername")
	List<String> getPreferredUsername() throws Exception;

	@YamlPropertyName(value="name")
	List<String> getName() throws Exception;

	@YamlPropertyName(value="email")
	List<String> getEmail() throws Exception;

	interface EZ extends LDAPAttributeMapping {

		@YamlPropertyName(value="id")
		default List<String> getID() throws Exception { return null; }

		@YamlPropertyName(value="preferredUsername")
		default List<String> getPreferredUsername() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default List<String> getName() throws Exception { return null; }

		@YamlPropertyName(value="email")
		default List<String> getEmail() throws Exception { return null; }

	}

}
