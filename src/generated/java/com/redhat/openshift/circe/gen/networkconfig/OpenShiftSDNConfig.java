package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
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
