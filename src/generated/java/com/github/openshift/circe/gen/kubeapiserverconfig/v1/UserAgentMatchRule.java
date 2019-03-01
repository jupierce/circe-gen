package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface UserAgentMatchRule extends Bean {

	@YamlPropertyName(value="regex")
	String getRegex() throws Exception;

	@YamlPropertyName(value="httpVerbs")
	List<String> getHTTPVerbs() throws Exception;

	interface EZ extends UserAgentMatchRule {

		@YamlPropertyName(value="regex")
		default String getRegex() throws Exception { return null; }

		@YamlPropertyName(value="httpVerbs")
		default List<String> getHTTPVerbs() throws Exception { return null; }

	}

}
