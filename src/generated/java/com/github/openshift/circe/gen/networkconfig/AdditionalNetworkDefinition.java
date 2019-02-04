package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AdditionalNetworkDefinition extends Bean {
	//json:type
	String getType() throws Exception;
	//json:name
	String getName() throws Exception;
	//json:rawCNIConfig
	String getRawCNIConfig() throws Exception;
}
