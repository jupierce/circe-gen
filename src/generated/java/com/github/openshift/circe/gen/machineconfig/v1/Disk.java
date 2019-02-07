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

}
