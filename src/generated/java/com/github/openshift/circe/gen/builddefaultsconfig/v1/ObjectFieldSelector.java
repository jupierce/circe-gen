package com.github.openshift.circe.gen.builddefaultsconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ObjectFieldSelector extends Bean {
	@YamlPropertyName(value="apiVersion")
	String getAPIVersion() throws Exception;

	@YamlPropertyName(value="fieldPath")
	String getFieldPath() throws Exception;

}
