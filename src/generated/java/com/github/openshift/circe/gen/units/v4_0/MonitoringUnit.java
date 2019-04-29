// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.units.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.configmap.v1.*;
import com.github.openshift.circe.beans.*;

public interface MonitoringUnit extends UnitBase {

	@RenderOrder(value ="0001")
	ConfigMap getConfigMap() throws Exception;

	interface EZ extends MonitoringUnit {

		@RenderOrder(value ="0001")
		default ConfigMap getConfigMap() throws Exception { return null; }

	}


}
