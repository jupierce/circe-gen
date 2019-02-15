package com.github.openshift.circe.gen.kubeapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OperandContainerSpec extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="resources")
	ResourceRequirements getResources() throws Exception;

	interface EZ extends OperandContainerSpec {

		default String getName() throws Exception { return null; }

		default ResourceRequirements getResources() throws Exception { return null; }

	}

}
