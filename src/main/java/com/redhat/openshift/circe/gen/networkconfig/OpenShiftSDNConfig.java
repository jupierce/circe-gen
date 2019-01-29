package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface OpenShiftSDNConfig {
	//org.json:mode
	String getMode();
	//org.json:vxlanPort
	Long getVXLANPort();
	//org.json:mtu
	Long getMTU();
	//org.json:useExternalOpenvswitch
	Boolean getUseExternalOpenvswitch();
}
