package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
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
