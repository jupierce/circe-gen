package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface LabelSelectorRequirement {
	//json:key
	String getKey();
	//json:operator
	String getOperator();
	//json:values
	List<String> getValues();
}
