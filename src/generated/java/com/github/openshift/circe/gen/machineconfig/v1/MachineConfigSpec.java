// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineConfigSpec extends Bean {

	@YamlPropertyName(value="osImageURL")
	String getOSImageURL() throws Exception;

	@YamlPropertyName(value="config")
	Config getConfig() throws Exception;

	interface EZ extends MachineConfigSpec {

		@YamlPropertyName(value="osImageURL")
		default String getOSImageURL() throws Exception { return null; }

		@YamlPropertyName(value="config")
		default Config getConfig() throws Exception { return null; }

	}

}
