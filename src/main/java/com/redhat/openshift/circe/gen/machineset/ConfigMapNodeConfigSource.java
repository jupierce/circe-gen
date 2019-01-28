package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface ConfigMapNodeConfigSource {
	//json:namespace
	String getNamespace();
	//json:name
	String getName();
	//json:uid
	String getUID();
	//json:resourceVersion
	String getResourceVersion();
	//json:kubeletConfigKey
	String getKubeletConfigKey();
}
