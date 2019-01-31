package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface LabelSelectorRequirement {
	//json:key
	String getKey();
	//json:operator
	String getOperator();
	//json:values
	List<String> getValues();
}
