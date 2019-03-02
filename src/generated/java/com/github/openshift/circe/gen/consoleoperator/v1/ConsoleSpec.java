// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.consoleoperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConsoleSpec extends Bean {

	@YamlPropertyName(value="operatorSpec")
	@YamlPropertyInline
	OperatorSpec getOperatorSpec() throws Exception;

	@YamlPropertyName(value="customization")
	ConsoleCustomization getCustomization() throws Exception;

	interface EZ extends ConsoleSpec {

		@YamlPropertyName(value="operatorSpec")
		@YamlPropertyInline
		default OperatorSpec getOperatorSpec() throws Exception { return null; }

		@YamlPropertyName(value="customization")
		default ConsoleCustomization getCustomization() throws Exception { return null; }

	}

}
