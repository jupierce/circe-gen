package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ObjectReference {
	//json:kind
	String getKind();
	//json:namespace
	String getNamespace();
	//json:name
	String getName();
	//json:uid
	String getUID();
	//json:apiVersion
	String getAPIVersion();
	//json:resourceVersion
	String getResourceVersion();
	//json:fieldPath
	String getFieldPath();
}
