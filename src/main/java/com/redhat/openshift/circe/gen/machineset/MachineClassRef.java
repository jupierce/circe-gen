package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface MachineClassRef {
	//json:objectReference
	ObjectReference getObjectReference();
	//json:provider
	String getProvider();
}
