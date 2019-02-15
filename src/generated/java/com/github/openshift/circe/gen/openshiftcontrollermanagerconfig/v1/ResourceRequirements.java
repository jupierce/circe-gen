package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceRequirements extends Bean {
	@YamlPropertyName(value="limits")
	Quantity getLimits() throws Exception;

	@YamlPropertyName(value="requests")
	Quantity getRequests() throws Exception;

}
