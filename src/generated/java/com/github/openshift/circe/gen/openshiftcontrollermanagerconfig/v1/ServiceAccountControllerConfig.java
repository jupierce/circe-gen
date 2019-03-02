package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ServiceAccountControllerConfig extends Bean {

	@YamlPropertyName(value="managedNames")
	List<String> getManagedNames() throws Exception;

	interface EZ extends ServiceAccountControllerConfig {

		@YamlPropertyName(value="managedNames")
		default List<String> getManagedNames() throws Exception { return null; }

	}

}
