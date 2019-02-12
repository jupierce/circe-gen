package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SessionConfig extends Bean {
	@YamlPropertyName(value="sessionSecretsFile")
	String getSessionSecretsFile() throws Exception;

	@YamlPropertyName(value="sessionMaxAgeSeconds")
	Long getSessionMaxAgeSeconds() throws Exception;

	@YamlPropertyName(value="sessionName")
	String getSessionName() throws Exception;

}
