package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Passwd extends Bean {

	@YamlPropertyName(value="groups")
	List<PasswdGroup> getGroups() throws Exception;

	@YamlPropertyName(value="users")
	List<PasswdUser> getUsers() throws Exception;

	interface EZ extends Passwd {

		@YamlPropertyName(value="groups")
		default List<PasswdGroup> getGroups() throws Exception { return null; }

		@YamlPropertyName(value="users")
		default List<PasswdUser> getUsers() throws Exception { return null; }

	}

}
