package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildControllerConfig extends Bean {
	@YamlPropertyName(value="imageTemplateFormat")
	ImageConfig getImageTemplateFormat() throws Exception;

	@YamlPropertyName(value="buildDefaults")
	BuildDefaultsConfig getBuildDefaults() throws Exception;

	@YamlPropertyName(value="buildOverrides")
	BuildOverridesConfig getBuildOverrides() throws Exception;

	@YamlPropertyName(value="additionalTrustedCA")
	String getAdditionalTrustedCA() throws Exception;

}
