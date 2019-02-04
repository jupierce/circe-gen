package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EnvVar extends Bean {
	//json:name
	String getName() throws Exception;
	//json:value
	String getValue() throws Exception;
	//json:valueFrom
	EnvVarSource getValueFrom() throws Exception;
}
