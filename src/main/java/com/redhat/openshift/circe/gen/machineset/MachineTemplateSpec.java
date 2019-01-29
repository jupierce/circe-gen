package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineTemplateSpec {
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//org.json:spec
	MachineSpec getSpec();
}
