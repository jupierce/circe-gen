package com.redhat.openshift.circe.gen.authentication;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface Authentication extends Bean {
	default String getKind() { return "Authentication"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "cluster"); }
	//json:spec
	AuthenticationSpec getSpec() throws Exception;
}
