package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Systemd extends Bean {
	@YamlPropertyName(value="units")
	List<Unit> getUnits() throws Exception;

}
