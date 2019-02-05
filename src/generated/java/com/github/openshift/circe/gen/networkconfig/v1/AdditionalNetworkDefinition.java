package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface AdditionalNetworkDefinition extends Bean {
	@YamlPropertyName(value="type")
	String getType() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="rawCNIConfig")
	String getRawCNIConfig() throws Exception;

}
