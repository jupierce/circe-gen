package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface Taint {
	//org.json:key
	String getKey();
	//org.json:value
	String getValue();
	//org.json:effect
	String getEffect();
	//org.json:timeAdded
	Time getTimeAdded();
}
