package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NodeUser extends Bean {
	@YamlPropertyName(value="id")
	Long getID() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

}
