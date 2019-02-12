package com.github.openshift.circe.gen.openshiftapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourcePatch extends Bean {
	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="patch")
	String getPatch() throws Exception;

}
