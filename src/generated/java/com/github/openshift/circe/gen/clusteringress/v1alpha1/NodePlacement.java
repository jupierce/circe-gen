// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.clusteringress.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NodePlacement extends Bean {

	@YamlPropertyName(value="nodeSelector")
	LabelSelector getNodeSelector() throws Exception;

	interface EZ extends NodePlacement {

		@YamlPropertyName(value="nodeSelector")
		default LabelSelector getNodeSelector() throws Exception { return null; }

	}

}
