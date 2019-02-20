package com.github.openshift.circe.gen.openshiftapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenShiftAPIServerSpec extends Bean {

	@YamlPropertyName(value="operatorSpec")
	@YamlPropertyInline
	OperatorSpec getOperatorSpec() throws Exception;

	interface EZ extends OpenShiftAPIServerSpec {

		@YamlPropertyName(value="operatorSpec")
		@YamlPropertyInline
		default OperatorSpec getOperatorSpec() throws Exception { return null; }

	}

}
