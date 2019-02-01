package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuth extends Bean {
	default String getKind() { return "OAuth"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "cluster"); }
	//json:spec
	OAuthSpec getSpec() throws Exception;
}
