package com.redhat.openshift.circe.gen.project;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProjectSpec extends Bean {
	//json:projectRequestMessage
	String getProjectRequestMessage() throws Exception;
	//json:projectRequestTemplate
	TemplateReference getProjectRequestTemplate() throws Exception;
}
