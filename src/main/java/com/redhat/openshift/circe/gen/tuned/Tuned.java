package com.redhat.openshift.circe.gen.tuned;

import java.util.*;

public interface Tuned {
	default String getKind() { return "Tuned"; }
	default String getApiVersion() { return "v1alpha1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("", "default"); }
	//json:spec
	TunedSpec getSpec();
}
