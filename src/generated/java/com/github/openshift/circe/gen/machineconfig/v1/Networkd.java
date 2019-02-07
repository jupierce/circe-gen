package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Networkd extends Bean {
	@YamlPropertyName(value="units")
	List<Networkdunit> getUnits() throws Exception;

}
