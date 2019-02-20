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

	interface EZ extends Mount {

		@YamlPropertyName(value="create")
		default Create getCreate() throws Exception { return null; }

		@YamlPropertyName(value="device")
		default String getDevice() throws Exception { return null; }

		@YamlPropertyName(value="format")
		default String getFormat() throws Exception { return null; }

		@YamlPropertyName(value="label")
		default String getLabel() throws Exception { return null; }

		@YamlPropertyName(value="options")
		default List<String> getOptions() throws Exception { return null; }

		@YamlPropertyName(value="uuid")
		default String getUUID() throws Exception { return null; }

		@YamlPropertyName(value="wipeFilesystem")
		default Boolean getWipeFilesystem() throws Exception { return null; }

	}

}
