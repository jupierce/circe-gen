// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ServiceReference extends Bean {

	@YamlPropertyName(value="namespace")
	String getNamespace() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="path")
	String getPath() throws Exception;

	interface EZ extends ServiceReference {

		@YamlPropertyName(value="namespace")
		default String getNamespace() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="path")
		default String getPath() throws Exception { return null; }

	}

}
