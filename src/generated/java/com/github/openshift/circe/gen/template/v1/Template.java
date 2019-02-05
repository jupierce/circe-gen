package com.github.openshift.circe.gen.template.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Template extends Bean {
	default String getKind() { return "Template"; }
	default String getApiVersion() { return "template.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-config"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "project-request-template"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	//json:message
	String getMessage() throws Exception;
	//json:parameters
	List<Parameter> getParameters() throws Exception;
	List<Bean> getObjects() throws Exception;
	//json:objectLabels
	Map<String,String> getObjectLabels() throws Exception;
}
