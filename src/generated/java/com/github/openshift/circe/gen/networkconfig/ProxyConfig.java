package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProxyConfig extends Bean {
	//json:iptablesSyncPeriod
	String getIptablesSyncPeriod() throws Exception;
	//json:bindAddress
	String getBindAddress() throws Exception;
	//json:proxyArguments
	Map<String,List<String>> getProxyArguments() throws Exception;
}
