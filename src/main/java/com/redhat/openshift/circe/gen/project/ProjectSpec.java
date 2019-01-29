package com.redhat.openshift.circe.gen.project;

import java.util.*;

public interface ProjectSpec {
	//org.json:projectRequestMessage
	String getProjectRequestMessage();
	//org.json:projectRequestTemplate
	TemplateReference getProjectRequestTemplate();
}
