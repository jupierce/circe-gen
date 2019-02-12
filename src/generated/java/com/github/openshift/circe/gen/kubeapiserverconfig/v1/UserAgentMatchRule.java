package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface UserAgentMatchRule extends Bean {
	@YamlPropertyName(value="regex")
	String getRegex() throws Exception;

	@YamlPropertyName(value="httpVerbs")
	List<String> getHTTPVerbs() throws Exception;

}
