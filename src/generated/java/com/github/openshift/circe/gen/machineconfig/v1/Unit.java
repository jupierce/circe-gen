// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Unit extends Bean {

	@YamlPropertyName(value="contents")
	String getContents() throws Exception;

	@YamlPropertyName(value="dropins")
	List<SystemdDropin> getDropins() throws Exception;

	@YamlPropertyName(value="enable")
	Boolean getEnable() throws Exception;

	@YamlPropertyName(value="enabled")
	Boolean getEnabled() throws Exception;

	@YamlPropertyName(value="mask")
	Boolean getMask() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	interface EZ extends Unit {

		@YamlPropertyName(value="contents")
		default String getContents() throws Exception { return null; }

		@YamlPropertyName(value="dropins")
		default List<SystemdDropin> getDropins() throws Exception { return null; }

		@YamlPropertyName(value="enable")
		default Boolean getEnable() throws Exception { return null; }

		@YamlPropertyName(value="enabled")
		default Boolean getEnabled() throws Exception { return null; }

		@YamlPropertyName(value="mask")
		default Boolean getMask() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

	}

}
