package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface AdditionalNetworkDefinition {
	//json:type
	String getType();
	//json:name
	String getName();
	//json:rawCNIConfig
	String getRawCNIConfig();
}
