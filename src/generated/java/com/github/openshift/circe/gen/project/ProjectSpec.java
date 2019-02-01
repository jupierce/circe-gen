package com.github.openshift.circe.gen.project;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProjectSpec extends Bean {
	//json:projectRequestMessage
	String getProjectRequestMessage() throws Exception;
	//json:projectRequestTemplate
	TemplateReference getProjectRequestTemplate() throws Exception;
}
