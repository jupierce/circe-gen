package com.github.openshift.circe.gen.project.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TemplateReference extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	interface EZ extends TemplateReference {

		default String getName() throws Exception { return null; }

	}

}
