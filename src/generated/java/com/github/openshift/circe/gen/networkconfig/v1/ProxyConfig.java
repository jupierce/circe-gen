package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProxyConfig extends Bean {

	@YamlPropertyName(value="iptablesSyncPeriod")
	String getIptablesSyncPeriod() throws Exception;

	@YamlPropertyName(value="bindAddress")
	String getBindAddress() throws Exception;

	@YamlPropertyName(value="proxyArguments")
	Map<String,List<String>> getProxyArguments() throws Exception;

	interface EZ extends ProxyConfig {

		default String getIptablesSyncPeriod() throws Exception { return null; }

		default String getBindAddress() throws Exception { return null; }

		default Map<String,List<String>> getProxyArguments() throws Exception { return null; }

	}

}
