package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Create extends Bean {
	@YamlPropertyName(value="force")
	Boolean getForce() throws Exception;

	@YamlPropertyName(value="options")
	List<String> getOptions() throws Exception;

}