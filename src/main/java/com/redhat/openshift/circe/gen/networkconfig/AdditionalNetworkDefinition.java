package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface AdditionalNetworkDefinition {
	//org.json:type
	String getType();
	//org.json:name
	String getName();
	//org.json:rawCNIConfig
	String getRawCNIConfig();
}
