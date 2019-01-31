package com.redhat.openshift.circe.gen.template;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface Template {
	default String getKind() { return "Template"; }
	default String getApiVersion() { return "template.openshift.io/v1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-config", "project-request-template"); }
	//json:message
	String getMessage();
	//json:parameters
	List<Parameter> getParameters();
	List<YamlProvider> getObjects();
	//json:objectLabels
	Map<String,String> getObjectLabels();
}
