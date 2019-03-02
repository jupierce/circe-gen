// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Networkd extends Bean {

	@YamlPropertyName(value="units")
	List<Networkdunit> getUnits() throws Exception;

	interface EZ extends Networkd {

		@YamlPropertyName(value="units")
		default List<Networkdunit> getUnits() throws Exception { return null; }

	}

}
