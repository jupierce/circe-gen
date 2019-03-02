// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LocalObjectReference extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	interface EZ extends LocalObjectReference {

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

	}

}
