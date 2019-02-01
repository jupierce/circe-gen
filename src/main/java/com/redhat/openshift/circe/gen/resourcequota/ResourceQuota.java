package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ResourceQuota extends Bean {
	default String getKind() { return "ResourceQuota"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", ""); }
	//json:spec
	ResourceQuotaSpec getSpec() throws Exception;
}
