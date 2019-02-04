package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Toleration extends Bean {
	//json:key
	String getKey() throws Exception;
	//json:operator
	String getOperator() throws Exception;
	//json:value
	String getValue() throws Exception;
	//json:effect
	String getEffect() throws Exception;
	//json:tolerationSeconds
	Long getTolerationSeconds() throws Exception;
}
