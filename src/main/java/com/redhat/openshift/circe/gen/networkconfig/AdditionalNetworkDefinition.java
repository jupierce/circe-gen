package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface AdditionalNetworkDefinition {
	//json:type
	String getType();
	//json:name
	String getName();
	//json:rawCNIConfig
	String getRawCNIConfig();
}
