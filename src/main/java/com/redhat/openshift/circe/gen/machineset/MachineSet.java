package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineSet extends Bean {
	default String getKind() { return "MachineSet"; }
	default String getApiVersion() { return "v1alpha1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSetSpec getSpec() throws Exception;
}
