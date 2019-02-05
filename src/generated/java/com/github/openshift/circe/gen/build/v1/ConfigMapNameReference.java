package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapNameReference extends Bean {
	@YamlPropertyName(value="name")
	String getName() throws Exception;

}
