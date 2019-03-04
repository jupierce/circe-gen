// GENERATED FILE -- DO NOT ALTER (circe.go)

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

	interface EZ extends SessionConfig {

		@YamlPropertyName(value="sessionSecretsFile")
		default String getSessionSecretsFile() throws Exception { return null; }

		@YamlPropertyName(value="sessionMaxAgeSeconds")
		default Long getSessionMaxAgeSeconds() throws Exception { return null; }

		@YamlPropertyName(value="sessionName")
		default String getSessionName() throws Exception { return null; }

	}

}
