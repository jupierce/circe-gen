package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IgnitionConfig extends Bean {
	@YamlPropertyName(value="append")
	List<ConfigReference> getAppend() throws Exception;

	@YamlPropertyName(value="replace")
	ConfigReference getReplace() throws Exception;

}
