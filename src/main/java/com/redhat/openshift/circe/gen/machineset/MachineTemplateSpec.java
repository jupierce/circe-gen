package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface MachineTemplateSpec {
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSpec getSpec();
}
