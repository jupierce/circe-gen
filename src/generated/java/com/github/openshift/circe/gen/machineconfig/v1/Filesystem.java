package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Filesystem extends Bean {
	@YamlPropertyName(value="mount")
	Mount getMount() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="path")
	String getPath() throws Exception;

}
