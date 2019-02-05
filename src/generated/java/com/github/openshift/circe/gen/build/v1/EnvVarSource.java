package com.github.openshift.circe.gen.build.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EnvVarSource extends Bean {
	//json:fieldRef
	ObjectFieldSelector getFieldRef() throws Exception;
	//json:resourceFieldRef
	ResourceFieldSelector getResourceFieldRef() throws Exception;
	//json:configMapKeyRef
	ConfigMapKeySelector getConfigMapKeyRef() throws Exception;
	//json:secretKeyRef
	SecretKeySelector getSecretKeyRef() throws Exception;
}
