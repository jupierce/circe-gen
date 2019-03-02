// GENERATED FILE -- DO NOT ALTER (circe.go)

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

		@YamlPropertyName(value="iptablesSyncPeriod")
		default String getIptablesSyncPeriod() throws Exception { return null; }

		@YamlPropertyName(value="bindAddress")
		default String getBindAddress() throws Exception { return null; }

		@YamlPropertyName(value="proxyArguments")
		default Map<String,List<String>> getProxyArguments() throws Exception { return null; }

	}

}
