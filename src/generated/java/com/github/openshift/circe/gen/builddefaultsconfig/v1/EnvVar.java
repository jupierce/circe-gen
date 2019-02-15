package com.github.openshift.circe.gen.builddefaultsconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EnvVar extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="valueFrom")
	EnvVarSource getValueFrom() throws Exception;

	interface EZ extends EnvVar {

		default String getName() throws Exception { return null; }

		default String getValue() throws Exception { return null; }

		default EnvVarSource getValueFrom() throws Exception { return null; }

	}

}
