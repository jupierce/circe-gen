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

		default String getGecos() throws Exception { return null; }

		default List<String> getGroups() throws Exception { return null; }

		default String getHomeDir() throws Exception { return null; }

		default Boolean getNoCreateHome() throws Exception { return null; }

		default Boolean getNoLogInit() throws Exception { return null; }

		default Boolean getNoUserGroup() throws Exception { return null; }

		default String getPrimaryGroup() throws Exception { return null; }

		default String getShell() throws Exception { return null; }

		default Boolean getSystem() throws Exception { return null; }

		default Long getUID() throws Exception { return null; }

	}

}
