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

	interface EZ extends BuildSpec {

		@YamlPropertyName(value="additionalTrustedCA")
		default ConfigMapNameReference getAdditionalTrustedCA() throws Exception { return null; }

		@YamlPropertyName(value="buildDefaults")
		default BuildDefaults getBuildDefaults() throws Exception { return null; }

		@YamlPropertyName(value="buildOverrides")
		default BuildOverrides getBuildOverrides() throws Exception { return null; }

	}

}
