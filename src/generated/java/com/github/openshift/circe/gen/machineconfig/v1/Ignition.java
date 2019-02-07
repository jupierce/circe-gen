package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Ignition extends Bean {
	@YamlPropertyName(value="config")
	IgnitionConfig getConfig() throws Exception;

	@YamlPropertyName(value="security")
	Security getSecurity() throws Exception;

	@YamlPropertyName(value="timeouts")
	Timeouts getTimeouts() throws Exception;

	@YamlPropertyName(value="version")
	String getVersion() throws Exception;

}
