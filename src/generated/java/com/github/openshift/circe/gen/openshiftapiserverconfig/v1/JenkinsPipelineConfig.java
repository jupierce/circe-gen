package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface JenkinsPipelineConfig extends Bean {

	@YamlPropertyName(value="autoProvisionEnabled")
	Boolean getAutoProvisionEnabled() throws Exception;

	@YamlPropertyName(value="templateNamespace")
	String getTemplateNamespace() throws Exception;

	@YamlPropertyName(value="templateName")
	String getTemplateName() throws Exception;

	@YamlPropertyName(value="serviceName")
	String getServiceName() throws Exception;

	@YamlPropertyName(value="parameters")
	Map<String,String> getParameters() throws Exception;

	interface EZ extends JenkinsPipelineConfig {

		@YamlPropertyName(value="autoProvisionEnabled")
		default Boolean getAutoProvisionEnabled() throws Exception { return null; }

		@YamlPropertyName(value="templateNamespace")
		default String getTemplateNamespace() throws Exception { return null; }

		@YamlPropertyName(value="templateName")
		default String getTemplateName() throws Exception { return null; }

		@YamlPropertyName(value="serviceName")
		default String getServiceName() throws Exception { return null; }

		@YamlPropertyName(value="parameters")
		default Map<String,String> getParameters() throws Exception { return null; }

	}

}
