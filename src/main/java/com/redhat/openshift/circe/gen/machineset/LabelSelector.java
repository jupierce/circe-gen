package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface LabelSelector {
	//org.json:matchLabels
	Map<String,String> getMatchLabels();
	//org.json:matchExpressions
	List<LabelSelectorRequirement> getMatchExpressions();
}
