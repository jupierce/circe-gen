package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineConfigSpec extends Bean {
	@YamlPropertyName(value="osImageURL")
	String getOSImageURL() throws Exception;

	@YamlPropertyName(value="config")
	Config getConfig() throws Exception;

}
