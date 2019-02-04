package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceFieldSelector extends Bean {
	//json:containerName
	String getContainerName() throws Exception;
	//json:resource
	String getResource() throws Exception;
	//json:divisor
	Quantity getDivisor() throws Exception;
}
