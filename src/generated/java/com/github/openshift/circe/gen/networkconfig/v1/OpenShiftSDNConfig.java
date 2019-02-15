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

		default String getMode() throws Exception { return null; }

		default Long getVXLANPort() throws Exception { return null; }

		default Long getMTU() throws Exception { return null; }

		default Boolean getUseExternalOpenvswitch() throws Exception { return null; }

	}

}
