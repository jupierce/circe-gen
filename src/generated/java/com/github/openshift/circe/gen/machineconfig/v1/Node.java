// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Node extends Bean {

	@YamlPropertyName(value="filesystem")
	String getFilesystem() throws Exception;

	@YamlPropertyName(value="group")
	NodeGroup getGroup() throws Exception;

	@YamlPropertyName(value="overwrite")
	Boolean getOverwrite() throws Exception;

	@YamlPropertyName(value="path")
	String getPath() throws Exception;

	@YamlPropertyName(value="user")
	NodeUser getUser() throws Exception;

	interface EZ extends Node {

		@YamlPropertyName(value="filesystem")
		default String getFilesystem() throws Exception { return null; }

		@YamlPropertyName(value="group")
		default NodeGroup getGroup() throws Exception { return null; }

		@YamlPropertyName(value="overwrite")
		default Boolean getOverwrite() throws Exception { return null; }

		@YamlPropertyName(value="path")
		default String getPath() throws Exception { return null; }

		@YamlPropertyName(value="user")
		default NodeUser getUser() throws Exception { return null; }

	}

}
