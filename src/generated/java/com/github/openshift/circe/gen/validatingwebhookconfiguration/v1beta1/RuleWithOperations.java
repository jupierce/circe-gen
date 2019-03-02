// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RuleWithOperations extends Bean {

	@YamlPropertyName(value="operations")
	List<String> getOperations() throws Exception;

	@YamlPropertyName(value="rule")
	@YamlPropertyInline
	Rule getRule() throws Exception;

	interface EZ extends RuleWithOperations {

		@YamlPropertyName(value="operations")
		default List<String> getOperations() throws Exception { return null; }

		@YamlPropertyName(value="rule")
		@YamlPropertyInline
		default Rule getRule() throws Exception { return null; }

	}

}
