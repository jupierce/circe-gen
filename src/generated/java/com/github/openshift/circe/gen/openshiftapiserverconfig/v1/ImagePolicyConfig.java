package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImagePolicyConfig extends Bean {
	@YamlPropertyName(value="maxImagesBulkImportedPerRepository")
	Long getMaxImagesBulkImportedPerRepository() throws Exception;

	@YamlPropertyName(value="allowedRegistriesForImport")
	List<RegistryLocation> getAllowedRegistriesForImport() throws Exception;

	@YamlPropertyName(value="internalRegistryHostname")
	String getInternalRegistryHostname() throws Exception;

	@YamlPropertyName(value="externalRegistryHostnames")
	List<String> getExternalRegistryHostnames() throws Exception;

	@YamlPropertyName(value="additionalTrustedCA")
	String getAdditionalTrustedCA() throws Exception;

}
