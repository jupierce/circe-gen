package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface ClusterNetwork {
	//org.json:cidr
	String getCIDR();
	//org.json:hostSubnetLength
	Long getHostSubnetLength();
}
