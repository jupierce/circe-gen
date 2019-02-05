package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NodeConfigSource extends Bean {
	@YamlPropertyName(value="configMap")
	ConfigMapNodeConfigSource getConfigMap() throws Exception;

}
