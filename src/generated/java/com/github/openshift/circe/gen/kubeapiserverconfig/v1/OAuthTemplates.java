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

}
