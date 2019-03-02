// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GroupResource extends Bean {

	@YamlPropertyName(value="group")
	String getGroup() throws Exception;

	@YamlPropertyName(value="resource")
	String getResource() throws Exception;

	interface EZ extends GroupResource {

		@YamlPropertyName(value="group")
		default String getGroup() throws Exception { return null; }

		@YamlPropertyName(value="resource")
		default String getResource() throws Exception { return null; }

	}

}
