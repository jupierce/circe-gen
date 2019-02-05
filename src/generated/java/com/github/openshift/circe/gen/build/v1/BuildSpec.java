package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildSpec extends Bean {
	@YamlPropertyName(value="additionalTrustedCA")
	ConfigMapNameReference getAdditionalTrustedCA() throws Exception;

	@YamlPropertyName(value="buildDefaults")
	BuildDefaults getBuildDefaults() throws Exception;

	@YamlPropertyName(value="buildOverrides")
	BuildOverrides getBuildOverrides() throws Exception;

}
