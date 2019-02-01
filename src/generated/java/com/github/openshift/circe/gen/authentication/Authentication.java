package com.github.openshift.circe.gen.authentication;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface Authentication extends Bean {
	default String getKind() { return "Authentication"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "cluster"); }
	//json:spec
	AuthenticationSpec getSpec() throws Exception;
}
