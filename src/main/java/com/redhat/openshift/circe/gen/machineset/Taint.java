package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface Taint {
	//json:key
	String getKey();
	//json:value
	String getValue();
	//json:effect
	String getEffect();
	//json:timeAdded
	Time getTimeAdded();
}
