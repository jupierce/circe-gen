package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface ProxyConfig {
	//org.json:iptablesSyncPeriod
	String getIptablesSyncPeriod();
	//org.json:bindAddress
	String getBindAddress();
	//org.json:proxyArguments
	Map<String,List<String>> getProxyArguments();
}
