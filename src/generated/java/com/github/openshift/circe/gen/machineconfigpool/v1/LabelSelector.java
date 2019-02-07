package com.github.openshift.circe.gen.machineconfigpool.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelector extends Bean {
	@YamlPropertyName(value="matchLabels")
	Map<String,String> getMatchLabels() throws Exception;

	@YamlPropertyName(value="matchExpressions")
	List<LabelSelectorRequirement> getMatchExpressions() throws Exception;

}
