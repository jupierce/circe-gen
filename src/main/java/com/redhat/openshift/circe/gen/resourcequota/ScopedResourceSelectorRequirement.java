package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ScopedResourceSelectorRequirement {
	//json:scopeName
	String getScopeName();
	//json:operator
	String getOperator();
	//json:values
	List<String> getValues();
}
