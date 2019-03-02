// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.project.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProjectSpec extends Bean {

	@YamlPropertyName(value="projectRequestMessage")
	String getProjectRequestMessage() throws Exception;

	@YamlPropertyName(value="projectRequestTemplate")
	TemplateReference getProjectRequestTemplate() throws Exception;

	interface EZ extends ProjectSpec {

		@YamlPropertyName(value="projectRequestMessage")
		default String getProjectRequestMessage() throws Exception { return null; }

		@YamlPropertyName(value="projectRequestTemplate")
		default TemplateReference getProjectRequestTemplate() throws Exception { return null; }

	}

}
