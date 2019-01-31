package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineSet {
	default String getKind() { return "MachineSet"; }
	default String getApiVersion() { return "v1alpha1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSetSpec getSpec();
}
