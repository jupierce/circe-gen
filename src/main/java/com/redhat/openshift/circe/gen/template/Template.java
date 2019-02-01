package com.redhat.openshift.circe.gen.template;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface Template extends Bean {
	default String getKind() { return "Template"; }
	default String getApiVersion() { return "template.openshift.io/v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-config", "project-request-template"); }
	//json:message
	String getMessage() throws Exception;
	//json:parameters
	List<Parameter> getParameters() throws Exception;
	List<Bean> getObjects() throws Exception;
	//json:objectLabels
	Map<String,String> getObjectLabels() throws Exception;
}
