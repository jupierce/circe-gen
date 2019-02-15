package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceFieldSelector extends Bean {
	@YamlPropertyName(value="containerName")
	String getContainerName() throws Exception;

	@YamlPropertyName(value="resource")
	String getResource() throws Exception;

	@YamlPropertyName(value="divisor")
	Quantity getDivisor() throws Exception;

}
