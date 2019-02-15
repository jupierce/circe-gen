package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProjectConfig extends Bean {
	@YamlPropertyName(value="defaultNodeSelector")
	String getDefaultNodeSelector() throws Exception;

	@YamlPropertyName(value="projectRequestMessage")
	String getProjectRequestMessage() throws Exception;

	@YamlPropertyName(value="projectRequestTemplate")
	String getProjectRequestTemplate() throws Exception;

}
