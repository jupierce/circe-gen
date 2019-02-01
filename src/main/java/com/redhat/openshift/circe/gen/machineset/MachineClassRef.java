package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineClassRef extends Bean {
	//json:objectReference
	ObjectReference getObjectReference() throws Exception;
	//json:provider
	String getProvider() throws Exception;
}
