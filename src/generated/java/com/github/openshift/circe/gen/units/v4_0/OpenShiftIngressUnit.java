// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.clusteringress.v1alpha1.*;
import com.github.openshift.circe.beans.*;

public interface OpenShiftIngressUnit extends UnitBase {

	@RenderOrder(value ="0001")
	ClusterIngress getClusterIngress() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<Secret> getSecretList() throws Exception;

	interface EZ extends OpenShiftIngressUnit {

		@RenderOrder(value ="0001")
		default ClusterIngress getClusterIngress() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default KubeList<Secret> getSecretList() throws Exception { return null; }

	}


}
