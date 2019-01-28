package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineClassRef {
	//json:objectReference
	ObjectReference getObjectReference();
	//json:provider
	String getProvider();
}
