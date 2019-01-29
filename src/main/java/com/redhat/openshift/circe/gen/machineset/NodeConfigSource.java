package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface NodeConfigSource {
	//org.json:configMap
	ConfigMapNodeConfigSource getConfigMap();
}
