package com.redhat.openshift.circe.gen.rolebindingrestriction;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ServiceAccountReference extends Bean {
	//json:name
	String getName() throws Exception;
	//json:namespace
	String getNamespace() throws Exception;
}
