package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ResourceQuota {
	default String getKind() { return "ResourceQuota"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("", ""); }
	//json:spec
	ResourceQuotaSpec getSpec();
}
