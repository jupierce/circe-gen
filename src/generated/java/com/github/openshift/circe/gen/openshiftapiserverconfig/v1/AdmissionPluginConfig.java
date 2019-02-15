package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AdmissionPluginConfig extends Bean {
	@YamlPropertyName(value="location")
	String getLocation() throws Exception;

	@YamlPropertyName(value="configuration")
	String getConfiguration() throws Exception;

}
