// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NodeUser extends Bean {

	@YamlPropertyName(value="id")
	Long getID() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	interface EZ extends NodeUser {

		@YamlPropertyName(value="id")
		default Long getID() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

	}

}
