package com.github.openshift.circe.gen.project.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProjectSpec extends Bean {
	@YamlPropertyName(value="projectRequestMessage")
	String getProjectRequestMessage() throws Exception;

	@YamlPropertyName(value="projectRequestTemplate")
	TemplateReference getProjectRequestTemplate() throws Exception;

}