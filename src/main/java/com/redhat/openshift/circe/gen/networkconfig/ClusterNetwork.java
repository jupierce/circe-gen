package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ClusterNetwork {
	//json:cidr
	String getCIDR();
	//json:hostSubnetLength
	Long getHostSubnetLength();
}
