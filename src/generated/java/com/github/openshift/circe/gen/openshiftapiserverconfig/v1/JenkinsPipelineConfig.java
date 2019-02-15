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

}
