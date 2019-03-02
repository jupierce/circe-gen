// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelector extends Bean {

	@YamlPropertyName(value="matchLabels")
	Map<String,String> getMatchLabels() throws Exception;

	@YamlPropertyName(value="matchExpressions")
	List<LabelSelectorRequirement> getMatchExpressions() throws Exception;

	interface EZ extends LabelSelector {

		@YamlPropertyName(value="matchLabels")
		default Map<String,String> getMatchLabels() throws Exception { return null; }

		@YamlPropertyName(value="matchExpressions")
		default List<LabelSelectorRequirement> getMatchExpressions() throws Exception { return null; }

	}

}
