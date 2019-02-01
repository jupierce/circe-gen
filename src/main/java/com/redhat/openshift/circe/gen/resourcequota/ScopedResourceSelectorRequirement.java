package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ScopedResourceSelectorRequirement extends Bean {
	//json:scopeName
	String getScopeName() throws Exception;
	//json:operator
	String getOperator() throws Exception;
	//json:values
	List<String> getValues() throws Exception;
}
