package com.github.openshift.circe.gen.build.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageLabel extends Bean {
	//json:name
	String getName() throws Exception;
	//json:value
	String getValue() throws Exception;
}
