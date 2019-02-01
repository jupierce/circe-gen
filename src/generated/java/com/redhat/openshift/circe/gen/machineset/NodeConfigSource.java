package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface NodeConfigSource extends Bean {
	//json:configMap
	ConfigMapNodeConfigSource getConfigMap() throws Exception;
}
