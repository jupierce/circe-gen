// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Toleration extends Bean {

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="operator")
	String getOperator() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="effect")
	String getEffect() throws Exception;

	@YamlPropertyName(value="tolerationSeconds")
	Long getTolerationSeconds() throws Exception;

	interface EZ extends Toleration {

		@YamlPropertyName(value="key")
		default String getKey() throws Exception { return null; }

		@YamlPropertyName(value="operator")
		default String getOperator() throws Exception { return null; }

		@YamlPropertyName(value="value")
		default String getValue() throws Exception { return null; }

		@YamlPropertyName(value="effect")
		default String getEffect() throws Exception { return null; }

		@YamlPropertyName(value="tolerationSeconds")
		default Long getTolerationSeconds() throws Exception { return null; }

	}

}
