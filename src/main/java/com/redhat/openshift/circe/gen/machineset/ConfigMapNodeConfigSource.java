package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface ConfigMapNodeConfigSource {
	//org.json:namespace
	String getNamespace();
	//org.json:name
	String getName();
	//org.json:uid
	String getUID();
	//org.json:resourceVersion
	String getResourceVersion();
	//org.json:kubeletConfigKey
	String getKubeletConfigKey();
}
