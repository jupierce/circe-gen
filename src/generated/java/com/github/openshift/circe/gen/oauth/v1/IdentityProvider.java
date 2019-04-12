// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProvider extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="mappingMethod")
	String getMappingMethod() throws Exception;

	@YamlPropertyName(value="identityProviderConfig")
	@YamlPropertyInline
	IdentityProviderConfig getIdentityProviderConfig() throws Exception;

	interface EZ extends IdentityProvider {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="mappingMethod")
		default String getMappingMethod() throws Exception { return null; }

		@YamlPropertyName(value="identityProviderConfig")
		@YamlPropertyInline
		default IdentityProviderConfig getIdentityProviderConfig() throws Exception { return null; }

	}

}
