// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.clusteringress.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterIngressHighAvailability extends Bean {

	@YamlPropertyName(value="type")
	String getType() throws Exception;

	interface EZ extends ClusterIngressHighAvailability {

		@YamlPropertyName(value="type")
		default String getType() throws Exception { return null; }

	}

}
