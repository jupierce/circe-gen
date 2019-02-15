package com.github.openshift.circe.gen.kubeapiserver.v1;
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

		default OperatorSpec getOperatorSpec() throws Exception { return null; }

		default Long getFailedRevisionLimit() throws Exception { return null; }

		default Long getSucceededRevisionLimit() throws Exception { return null; }

	}

}
