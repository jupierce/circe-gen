package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerProjectConfig extends Bean {
	@YamlPropertyName(value="defaultNodeSelector")
	String getDefaultNodeSelector() throws Exception;

}
