package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineVersionInfo {
	//json:kubelet
	String getKubelet();
	//json:controlPlane
	String getControlPlane();
}
