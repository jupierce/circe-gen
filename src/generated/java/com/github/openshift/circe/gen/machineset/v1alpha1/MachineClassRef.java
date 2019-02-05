package com.github.openshift.circe.gen.machineset.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineClassRef extends Bean {
	//json:objectReference
	ObjectReference getObjectReference() throws Exception;
	//json:provider
	String getProvider() throws Exception;
}
