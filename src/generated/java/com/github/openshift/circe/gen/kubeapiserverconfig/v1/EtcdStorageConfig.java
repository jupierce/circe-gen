// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EtcdStorageConfig extends Bean {

	@YamlPropertyName(value="etcdConnectionInfo")
	@YamlPropertyInline
	EtcdConnectionInfo getEtcdConnectionInfo() throws Exception;

	@YamlPropertyName(value="storagePrefix")
	String getStoragePrefix() throws Exception;

	interface EZ extends EtcdStorageConfig {

		@YamlPropertyName(value="etcdConnectionInfo")
		@YamlPropertyInline
		default EtcdConnectionInfo getEtcdConnectionInfo() throws Exception { return null; }

		@YamlPropertyName(value="storagePrefix")
		default String getStoragePrefix() throws Exception { return null; }

	}

}
