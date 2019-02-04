package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineVersionInfo extends Bean {
	//json:kubelet
	String getKubelet() throws Exception;
	//json:controlPlane
	String getControlPlane() throws Exception;
}
