package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface ProxyConfig {
	//json:iptablesSyncPeriod
	String getIptablesSyncPeriod();
	//json:bindAddress
	String getBindAddress();
	//json:proxyArguments
	Map<String,List<String>> getProxyArguments();
}
