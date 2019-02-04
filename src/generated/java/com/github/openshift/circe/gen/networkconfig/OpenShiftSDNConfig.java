package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftSDNConfig extends Bean {
	//json:mode
	String getMode() throws Exception;
	//json:vxlanPort
	Long getVXLANPort() throws Exception;
	//json:mtu
	Long getMTU() throws Exception;
	//json:useExternalOpenvswitch
	Boolean getUseExternalOpenvswitch() throws Exception;
}
