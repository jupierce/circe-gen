// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Usercreate extends Bean {

	@YamlPropertyName(value="gecos")
	String getGecos() throws Exception;

	@YamlPropertyName(value="groups")
	List<String> getGroups() throws Exception;

	@YamlPropertyName(value="homeDir")
	String getHomeDir() throws Exception;

	@YamlPropertyName(value="noCreateHome")
	Boolean getNoCreateHome() throws Exception;

	@YamlPropertyName(value="noLogInit")
	Boolean getNoLogInit() throws Exception;

	@YamlPropertyName(value="noUserGroup")
	Boolean getNoUserGroup() throws Exception;

	@YamlPropertyName(value="primaryGroup")
	String getPrimaryGroup() throws Exception;

	@YamlPropertyName(value="shell")
	String getShell() throws Exception;

	@YamlPropertyName(value="system")
	Boolean getSystem() throws Exception;

	@YamlPropertyName(value="uid")
	Long getUID() throws Exception;

	interface EZ extends Usercreate {

		@YamlPropertyName(value="gecos")
		default String getGecos() throws Exception { return null; }

		@YamlPropertyName(value="groups")
		default List<String> getGroups() throws Exception { return null; }

		@YamlPropertyName(value="homeDir")
		default String getHomeDir() throws Exception { return null; }

		@YamlPropertyName(value="noCreateHome")
		default Boolean getNoCreateHome() throws Exception { return null; }

		@YamlPropertyName(value="noLogInit")
		default Boolean getNoLogInit() throws Exception { return null; }

		@YamlPropertyName(value="noUserGroup")
		default Boolean getNoUserGroup() throws Exception { return null; }

		@YamlPropertyName(value="primaryGroup")
		default String getPrimaryGroup() throws Exception { return null; }

		@YamlPropertyName(value="shell")
		default String getShell() throws Exception { return null; }

		@YamlPropertyName(value="system")
		default Boolean getSystem() throws Exception { return null; }

		@YamlPropertyName(value="uid")
		default Long getUID() throws Exception { return null; }

	}

}
