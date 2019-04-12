// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.consoleoperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OperatorSpec extends Bean {

	@YamlPropertyName(value="managementState")
	String getManagementState() throws Exception;

	@YamlPropertyName(value="logLevel")
	String getLogLevel() throws Exception;

	@YamlPropertyName(value="operatorLogLevel")
	String getOperatorLogLevel() throws Exception;

	@YamlPropertyName(value="unsupportedConfigOverrides")
	Bean getUnsupportedConfigOverrides() throws Exception;

	@YamlPropertyName(value="observedConfig")
	Bean getObservedConfig() throws Exception;

	interface EZ extends OperatorSpec {

		@YamlPropertyName(value="managementState")
		default String getManagementState() throws Exception { return null; }

		@YamlPropertyName(value="logLevel")
		default String getLogLevel() throws Exception { return null; }

		@YamlPropertyName(value="operatorLogLevel")
		default String getOperatorLogLevel() throws Exception { return null; }

		@YamlPropertyName(value="unsupportedConfigOverrides")
		default Bean getUnsupportedConfigOverrides() throws Exception { return null; }

		@YamlPropertyName(value="observedConfig")
		default Bean getObservedConfig() throws Exception { return null; }

	}

}
