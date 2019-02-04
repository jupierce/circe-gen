package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelector extends Bean {
	//json:matchLabels
	Map<String,String> getMatchLabels() throws Exception;
	//json:matchExpressions
	List<LabelSelectorRequirement> getMatchExpressions() throws Exception;
}
