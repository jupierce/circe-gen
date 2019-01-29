package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineVersionInfo {
	//org.json:kubelet
	String getKubelet();
	//org.json:controlPlane
	String getControlPlane();
}
