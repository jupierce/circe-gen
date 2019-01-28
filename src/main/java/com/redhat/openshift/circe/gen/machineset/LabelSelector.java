package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface LabelSelector {
	//json:matchLabels
	Map<String,String> getMatchLabels();
	//json:matchExpressions
	List<LabelSelectorRequirement> getMatchExpressions();
}
