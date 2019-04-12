// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.ingresscontrolleroperator.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NodePlacement extends Bean {

	@YamlPropertyName(value="nodeSelector")
	LabelSelector getNodeSelector() throws Exception;

	@YamlPropertyName(value="tolerations")
	List<Toleration> getTolerations() throws Exception;

	interface EZ extends NodePlacement {

		@YamlPropertyName(value="nodeSelector")
		default LabelSelector getNodeSelector() throws Exception { return null; }

		@YamlPropertyName(value="tolerations")
		default List<Toleration> getTolerations() throws Exception { return null; }

	}

}
