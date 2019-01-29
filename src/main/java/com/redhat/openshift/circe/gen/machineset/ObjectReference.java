package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface ObjectReference {
	//org.json:kind
	String getKind();
	//org.json:namespace
	String getNamespace();
	//org.json:name
	String getName();
	//org.json:uid
	String getUID();
	//org.json:apiVersion
	String getAPIVersion();
	//org.json:resourceVersion
	String getResourceVersion();
	//org.json:fieldPath
	String getFieldPath();
}
