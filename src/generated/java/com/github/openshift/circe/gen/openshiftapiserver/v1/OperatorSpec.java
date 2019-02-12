package com.github.openshift.circe.gen.openshiftapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OperatorSpec extends Bean {
	@YamlPropertyName(value="managementState")
	String getManagementState() throws Exception;

	@YamlPropertyName(value="logLevel")
	String getLogLevel() throws Exception;

	@YamlPropertyName(value="operandSpecs")
	List<OperandSpec> getOperandSpecs() throws Exception;

	@YamlPropertyName(value="unsupportedConfigOverrides")
	String getUnsupportedConfigOverrides() throws Exception;

	@YamlPropertyName(value="observedConfig")
	String getObservedConfig() throws Exception;

}
