package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
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
