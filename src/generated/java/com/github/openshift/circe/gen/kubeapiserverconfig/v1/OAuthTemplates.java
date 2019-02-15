package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OAuthTemplates extends Bean {

	@YamlPropertyName(value="login")
	String getLogin() throws Exception;

	@YamlPropertyName(value="providerSelection")
	String getProviderSelection() throws Exception;

	@YamlPropertyName(value="error")
	String getError() throws Exception;

	interface EZ extends OAuthTemplates {

		default String getLogin() throws Exception { return null; }

		default String getProviderSelection() throws Exception { return null; }

		default String getError() throws Exception { return null; }

	}

}
