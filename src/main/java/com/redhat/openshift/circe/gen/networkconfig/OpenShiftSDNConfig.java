package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface OpenShiftSDNConfig {
	//json:mode
	String getMode();
	//json:vxlanPort
	Long getVXLANPort();
	//json:mtu
	Long getMTU();
	//json:useExternalOpenvswitch
	Boolean getUseExternalOpenvswitch();
}
