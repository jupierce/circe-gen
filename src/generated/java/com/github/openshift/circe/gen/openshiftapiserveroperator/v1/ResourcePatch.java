// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.openshiftapiserveroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourcePatch extends Bean {

	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="patch")
	String getPatch() throws Exception;

	interface EZ extends ResourcePatch {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

		@YamlPropertyName(value="patch")
		default String getPatch() throws Exception { return null; }

	}

}
