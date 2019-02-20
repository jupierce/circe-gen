package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Disk extends Bean {

	@YamlPropertyName(value="device")
	String getDevice() throws Exception;

	@YamlPropertyName(value="partitions")
	List<Partition> getPartitions() throws Exception;

	@YamlPropertyName(value="wipeTable")
	Boolean getWipeTable() throws Exception;

	interface EZ extends Disk {

		@YamlPropertyName(value="device")
		default String getDevice() throws Exception { return null; }

		@YamlPropertyName(value="partitions")
		default List<Partition> getPartitions() throws Exception { return null; }

		@YamlPropertyName(value="wipeTable")
		default Boolean getWipeTable() throws Exception { return null; }

	}

}
