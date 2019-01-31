package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface DefaultNetworkDefinition {
	//json:type
	String getType();
	//json:openshiftSDNConfig
	OpenShiftSDNConfig getOpenShiftSDNConfig();
	//json:ovnKubernetesConfig
	OVNKubernetesConfig getOVNKubernetesConfig();
	//json:otherConfig
	Map<String,String> getOtherConfig();
}
