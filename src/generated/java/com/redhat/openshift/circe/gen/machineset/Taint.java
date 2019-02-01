package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
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
