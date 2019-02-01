package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineVersionInfo extends Bean {
	//json:kubelet
	String getKubelet() throws Exception;
	//json:controlPlane
	String getControlPlane() throws Exception;
}
