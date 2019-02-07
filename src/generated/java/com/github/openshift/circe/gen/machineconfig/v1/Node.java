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

}
