package com.redhat.openshift.circe.gen.project;

import java.util.*;

public interface Project {
	default String getKind() { return "Project"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-config", "cluster"); }
	//org.json:spec
	ProjectSpec getSpec();
}
