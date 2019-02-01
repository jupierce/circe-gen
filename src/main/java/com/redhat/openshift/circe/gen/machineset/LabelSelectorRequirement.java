package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface LabelSelectorRequirement extends Bean {
	//json:key
	String getKey() throws Exception;
	//json:operator
	String getOperator() throws Exception;
	//json:values
	List<String> getValues() throws Exception;
}
