package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProxyConfig extends Bean {
	//json:iptablesSyncPeriod
	String getIptablesSyncPeriod() throws Exception;
	//json:bindAddress
	String getBindAddress() throws Exception;
	//json:proxyArguments
	Map<String,List<String>> getProxyArguments() throws Exception;
}
