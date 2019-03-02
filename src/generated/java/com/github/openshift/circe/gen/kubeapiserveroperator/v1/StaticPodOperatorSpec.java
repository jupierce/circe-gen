// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserveroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface StaticPodOperatorSpec extends Bean {

	@YamlPropertyName(value="operatorSpec")
	@YamlPropertyInline
	OperatorSpec getOperatorSpec() throws Exception;

	@YamlPropertyName(value="failedRevisionLimit")
	Long getFailedRevisionLimit() throws Exception;

	@YamlPropertyName(value="succeededRevisionLimit")
	Long getSucceededRevisionLimit() throws Exception;

	interface EZ extends StaticPodOperatorSpec {

		@YamlPropertyName(value="operatorSpec")
		@YamlPropertyInline
		default OperatorSpec getOperatorSpec() throws Exception { return null; }

		@YamlPropertyName(value="failedRevisionLimit")
		default Long getFailedRevisionLimit() throws Exception { return null; }

		@YamlPropertyName(value="succeededRevisionLimit")
		default Long getSucceededRevisionLimit() throws Exception { return null; }

	}

}
