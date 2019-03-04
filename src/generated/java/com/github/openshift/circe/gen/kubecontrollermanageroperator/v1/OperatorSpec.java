// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubecontrollermanageroperator.v1;
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
	Bean getUnsupportedConfigOverrides() throws Exception;

	@YamlPropertyName(value="observedConfig")
	Bean getObservedConfig() throws Exception;

	interface EZ extends OperatorSpec {

		@YamlPropertyName(value="managementState")
		default String getManagementState() throws Exception { return null; }

		@YamlPropertyName(value="logLevel")
		default String getLogLevel() throws Exception { return null; }

		@YamlPropertyName(value="operandSpecs")
		default List<OperandSpec> getOperandSpecs() throws Exception { return null; }

		@YamlPropertyName(value="unsupportedConfigOverrides")
		default Bean getUnsupportedConfigOverrides() throws Exception { return null; }

		@YamlPropertyName(value="observedConfig")
		default Bean getObservedConfig() throws Exception { return null; }

	}

}
