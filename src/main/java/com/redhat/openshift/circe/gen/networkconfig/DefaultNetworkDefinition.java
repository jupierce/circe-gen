package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface DefaultNetworkDefinition {
	//org.json:type
	String getType();
	//org.json:openshiftSDNConfig
	OpenShiftSDNConfig getOpenShiftSDNConfig();
	//org.json:ovnKubernetesConfig
	OVNKubernetesConfig getOVNKubernetesConfig();
	//org.json:otherConfig
	Map<String,String> getOtherConfig();
}
