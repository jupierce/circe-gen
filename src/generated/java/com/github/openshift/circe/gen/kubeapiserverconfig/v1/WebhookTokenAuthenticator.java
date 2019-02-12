package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface WebhookTokenAuthenticator extends Bean {
	@YamlPropertyName(value="configFile")
	String getConfigFile() throws Exception;

	@YamlPropertyName(value="cacheTTL")
	String getCacheTTL() throws Exception;

}
