package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineSet extends Bean {
	default String getKind() { return "MachineSet"; }
	default String getApiVersion() { return "v1alpha1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSetSpec getSpec() throws Exception;
}
