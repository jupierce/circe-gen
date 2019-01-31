package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface NodeConfigSource {
	//json:configMap
	ConfigMapNodeConfigSource getConfigMap();
}
