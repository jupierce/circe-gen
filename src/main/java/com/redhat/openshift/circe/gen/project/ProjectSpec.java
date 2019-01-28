package com.redhat.openshift.circe.gen.project;

import java.util.*;

public interface ProjectSpec {
	//json:projectRequestMessage
	String getProjectRequestMessage();
	//json:projectRequestTemplate
	TemplateReference getProjectRequestTemplate();
}
