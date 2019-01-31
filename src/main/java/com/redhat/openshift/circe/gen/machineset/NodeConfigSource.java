package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface NodeConfigSource {
	//json:configMap
	ConfigMapNodeConfigSource getConfigMap();
}
