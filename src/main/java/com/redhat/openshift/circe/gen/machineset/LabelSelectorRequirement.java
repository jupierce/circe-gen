package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface LabelSelectorRequirement {
	//org.json:key
	String getKey();
	//org.json:operator
	String getOperator();
	//org.json:values
	List<String> getValues();
}
