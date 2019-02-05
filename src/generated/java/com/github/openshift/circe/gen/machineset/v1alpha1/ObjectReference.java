package com.github.openshift.circe.gen.machineset.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ObjectReference extends Bean {
	//json:kind
	String getKind() throws Exception;
	//json:namespace
	String getNamespace() throws Exception;
	//json:name
	String getName() throws Exception;
	//json:uid
	String getUID() throws Exception;
	//json:apiVersion
	String getAPIVersion() throws Exception;
	//json:resourceVersion
	String getResourceVersion() throws Exception;
	//json:fieldPath
	String getFieldPath() throws Exception;
}
