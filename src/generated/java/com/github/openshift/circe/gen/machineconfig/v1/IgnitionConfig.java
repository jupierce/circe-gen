// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IgnitionConfig extends Bean {

	@YamlPropertyName(value="append")
	List<ConfigReference> getAppend() throws Exception;

	@YamlPropertyName(value="replace")
	ConfigReference getReplace() throws Exception;

	interface EZ extends IgnitionConfig {

		@YamlPropertyName(value="append")
		default List<ConfigReference> getAppend() throws Exception { return null; }

		@YamlPropertyName(value="replace")
		default ConfigReference getReplace() throws Exception { return null; }

	}

}
