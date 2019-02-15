package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RegistriesConfig extends Bean {

	@YamlPropertyName(value="searchRegistries")
	List<String> getSearchRegistries() throws Exception;

	@YamlPropertyName(value="insecureRegistries")
	List<String> getInsecureRegistries() throws Exception;

	@YamlPropertyName(value="blockedRegistries")
	List<String> getBlockedRegistries() throws Exception;

	@YamlPropertyName(value="allowedRegistries")
	List<String> getAllowedRegistries() throws Exception;

	interface EZ extends RegistriesConfig {

		default List<String> getSearchRegistries() throws Exception { return null; }

		default List<String> getInsecureRegistries() throws Exception { return null; }

		default List<String> getBlockedRegistries() throws Exception { return null; }

		default List<String> getAllowedRegistries() throws Exception { return null; }

	}

}
