package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceRequirements extends Bean {
	//json:limits
	Quantity getLimits() throws Exception;
	//json:requests
	Quantity getRequests() throws Exception;
}
