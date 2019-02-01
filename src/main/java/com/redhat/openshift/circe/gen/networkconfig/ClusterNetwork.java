package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ClusterNetwork extends Bean {
	//json:cidr
	String getCIDR() throws Exception;
	//json:hostSubnetLength
	Long getHostSubnetLength() throws Exception;
}
