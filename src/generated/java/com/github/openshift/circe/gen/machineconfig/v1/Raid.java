package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Raid extends Bean {
	@YamlPropertyName(value="devices")
	List<String> getDevices() throws Exception;

	@YamlPropertyName(value="level")
	String getLevel() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="options")
	List<String> getOptions() throws Exception;

	@YamlPropertyName(value="spares")
	Long getSpares() throws Exception;

}
