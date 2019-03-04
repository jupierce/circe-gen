// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProvider extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="challenge")
	Boolean getUseAsChallenger() throws Exception;

	@YamlPropertyName(value="login")
	Boolean getUseAsLogin() throws Exception;

	@YamlPropertyName(value="mappingMethod")
	String getMappingMethod() throws Exception;

	@YamlPropertyName(value="provider")
	Bean getProvider() throws Exception;

	interface EZ extends IdentityProvider {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="challenge")
		default Boolean getUseAsChallenger() throws Exception { return null; }

		@YamlPropertyName(value="login")
		default Boolean getUseAsLogin() throws Exception { return null; }

		@YamlPropertyName(value="mappingMethod")
		default String getMappingMethod() throws Exception { return null; }

		@YamlPropertyName(value="provider")
		default Bean getProvider() throws Exception { return null; }

	}

}
