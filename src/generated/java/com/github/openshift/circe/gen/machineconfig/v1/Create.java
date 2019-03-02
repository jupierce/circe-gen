// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Create extends Bean {

	@YamlPropertyName(value="force")
	Boolean getForce() throws Exception;

	@YamlPropertyName(value="options")
	List<String> getOptions() throws Exception;

	interface EZ extends Create {

		@YamlPropertyName(value="force")
		default Boolean getForce() throws Exception { return null; }

		@YamlPropertyName(value="options")
		default List<String> getOptions() throws Exception { return null; }

	}

}
