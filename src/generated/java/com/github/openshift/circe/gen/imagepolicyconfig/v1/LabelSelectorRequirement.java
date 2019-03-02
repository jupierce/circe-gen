// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelectorRequirement extends Bean {

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="operator")
	String getOperator() throws Exception;

	@YamlPropertyName(value="values")
	List<String> getValues() throws Exception;

	interface EZ extends LabelSelectorRequirement {

		@YamlPropertyName(value="key")
		default String getKey() throws Exception { return null; }

		@YamlPropertyName(value="operator")
		default String getOperator() throws Exception { return null; }

		@YamlPropertyName(value="values")
		default List<String> getValues() throws Exception { return null; }

	}

}
