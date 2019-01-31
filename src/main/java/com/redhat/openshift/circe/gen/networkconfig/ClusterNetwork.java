package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface ClusterNetwork {
	//json:cidr
	String getCIDR();
	//json:hostSubnetLength
	Long getHostSubnetLength();
}
