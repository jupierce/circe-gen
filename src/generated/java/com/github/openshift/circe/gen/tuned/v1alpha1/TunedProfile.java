package com.github.openshift.circe.gen.tuned.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedProfile extends Bean {
	//json:name
	String getName() throws Exception;
	//json:data
	String getData() throws Exception;
}
