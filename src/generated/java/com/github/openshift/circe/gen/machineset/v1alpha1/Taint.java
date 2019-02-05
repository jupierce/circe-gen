package com.github.openshift.circe.gen.machineset.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Taint extends Bean {
	//json:key
	String getKey() throws Exception;
	//json:value
	String getValue() throws Exception;
	//json:effect
	String getEffect() throws Exception;
	//json:timeAdded
	Time getTimeAdded() throws Exception;
}
