package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineSet {
	default String getKind() { return "MachineSet"; }
	default String getApiVersion() { return "v1alpha1"; }
	//json:spec
	MachineSetSpec getSpec();
}
