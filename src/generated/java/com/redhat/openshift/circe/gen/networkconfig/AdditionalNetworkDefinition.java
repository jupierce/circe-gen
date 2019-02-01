package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface AdditionalNetworkDefinition extends Bean {
	//json:type
	String getType() throws Exception;
	//json:name
	String getName() throws Exception;
	//json:rawCNIConfig
	String getRawCNIConfig() throws Exception;
}
