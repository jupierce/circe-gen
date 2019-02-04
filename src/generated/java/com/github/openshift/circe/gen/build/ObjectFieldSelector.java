package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ObjectFieldSelector extends Bean {
	//json:apiVersion
	String getAPIVersion() throws Exception;
	//json:fieldPath
	String getFieldPath() throws Exception;
}
