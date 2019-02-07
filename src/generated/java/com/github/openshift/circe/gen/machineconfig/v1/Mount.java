package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Mount extends Bean {
	@YamlPropertyName(value="create")
	Create getCreate() throws Exception;

	@YamlPropertyName(value="device")
	String getDevice() throws Exception;

	@YamlPropertyName(value="format")
	String getFormat() throws Exception;

	@YamlPropertyName(value="label")
	String getLabel() throws Exception;

	@YamlPropertyName(value="options")
	List<String> getOptions() throws Exception;

	@YamlPropertyName(value="uuid")
	String getUUID() throws Exception;

	@YamlPropertyName(value="wipeFilesystem")
	Boolean getWipeFilesystem() throws Exception;

}
