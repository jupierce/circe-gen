// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftSDNConfig extends Bean {

	@YamlPropertyName(value="mode")
	String getMode() throws Exception;

	@YamlPropertyName(value="vxlanPort")
	Long getVXLANPort() throws Exception;

	@YamlPropertyName(value="mtu")
	Long getMTU() throws Exception;

	@YamlPropertyName(value="useExternalOpenvswitch")
	Boolean getUseExternalOpenvswitch() throws Exception;

	interface EZ extends OpenShiftSDNConfig {

		@YamlPropertyName(value="mode")
		default String getMode() throws Exception { return null; }

		@YamlPropertyName(value="vxlanPort")
		default Long getVXLANPort() throws Exception { return null; }

		@YamlPropertyName(value="mtu")
		default Long getMTU() throws Exception { return null; }

		@YamlPropertyName(value="useExternalOpenvswitch")
		default Boolean getUseExternalOpenvswitch() throws Exception { return null; }

	}

}
