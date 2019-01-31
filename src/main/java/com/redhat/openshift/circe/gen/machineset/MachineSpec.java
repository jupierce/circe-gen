package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface MachineSpec {
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:taints
	List<Taint> getTaints();
	//json:providerSpec
	ProviderSpec getProviderSpec();
	//json:versions
	MachineVersionInfo getVersions();
	//json:configSource
	NodeConfigSource getConfigSource();
}
