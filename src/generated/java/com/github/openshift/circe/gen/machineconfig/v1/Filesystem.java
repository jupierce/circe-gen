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

	interface EZ extends Filesystem {

		@YamlPropertyName(value="mount")
		default Mount getMount() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="path")
		default String getPath() throws Exception { return null; }

	}

}
