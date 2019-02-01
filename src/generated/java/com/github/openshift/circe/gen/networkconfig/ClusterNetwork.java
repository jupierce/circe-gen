package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface ClusterNetwork extends Bean {
	//json:cidr
	String getCIDR() throws Exception;
	//json:hostSubnetLength
	Long getHostSubnetLength() throws Exception;
}
