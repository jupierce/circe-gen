// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AggregatorConfig extends Bean {

	@YamlPropertyName(value="proxyClientInfo")
	CertInfo getProxyClientInfo() throws Exception;

	interface EZ extends AggregatorConfig {

		@YamlPropertyName(value="proxyClientInfo")
		default CertInfo getProxyClientInfo() throws Exception { return null; }

	}

}
