package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
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
