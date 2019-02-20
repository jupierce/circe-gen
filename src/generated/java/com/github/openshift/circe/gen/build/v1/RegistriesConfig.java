package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RegistriesConfig extends Bean {

	@YamlPropertyName(value="insecureRegistries")
	List<String> getInsecureRegistries() throws Exception;

	@YamlPropertyName(value="blockedRegistries")
	List<String> getBlockedRegistries() throws Exception;

	@YamlPropertyName(value="allowedRegistries")
	List<String> getAllowedRegistries() throws Exception;

	interface EZ extends RegistriesConfig {

		@YamlPropertyName(value="insecureRegistries")
		default List<String> getInsecureRegistries() throws Exception { return null; }

		@YamlPropertyName(value="blockedRegistries")
		default List<String> getBlockedRegistries() throws Exception { return null; }

		@YamlPropertyName(value="allowedRegistries")
		default List<String> getAllowedRegistries() throws Exception { return null; }

	}

}
