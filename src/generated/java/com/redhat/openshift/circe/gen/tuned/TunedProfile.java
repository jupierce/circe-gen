package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface TunedProfile extends Bean {
	//json:name
	String getName() throws Exception;
	//json:data
	String getData() throws Exception;
}
