// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.apiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapNameReference extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	interface EZ extends ConfigMapNameReference {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

	}

}
