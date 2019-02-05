package com.github.openshift.circe.gen.build.v1;
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

}
