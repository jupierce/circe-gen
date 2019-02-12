package com.github.openshift.circe.gen.openshiftapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OperandSpec extends Bean {
	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="operandContainerSpecs")
	List<OperandContainerSpec> getOperandContainerSpecs() throws Exception;

	@YamlPropertyName(value="unsupportedResourcePatches")
	List<ResourcePatch> getUnsupportedResourcePatches() throws Exception;

}
