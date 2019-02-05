package com.github.openshift.circe.gen.machineset.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConfigMapNodeConfigSource extends Bean {
	//json:namespace
	String getNamespace() throws Exception;
	//json:name
	String getName() throws Exception;
	//json:uid
	String getUID() throws Exception;
	//json:resourceVersion
	String getResourceVersion() throws Exception;
	//json:kubeletConfigKey
	String getKubeletConfigKey() throws Exception;
}
