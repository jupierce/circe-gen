package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface DefaultNetworkDefinition extends Bean {
	//json:type
	String getType() throws Exception;
	//json:openshiftSDNConfig
	OpenShiftSDNConfig getOpenShiftSDNConfig() throws Exception;
	//json:ovnKubernetesConfig
	OVNKubernetesConfig getOVNKubernetesConfig() throws Exception;
	//json:otherConfig
	Map<String,String> getOtherConfig() throws Exception;
}
