package com.github.openshift.circe.gen.build.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapKeySelector extends Bean {
	//json:localObjectReference
	LocalObjectReference getLocalObjectReference() throws Exception;
	//json:key
	String getKey() throws Exception;
	//json:optional
	Boolean getOptional() throws Exception;
}
