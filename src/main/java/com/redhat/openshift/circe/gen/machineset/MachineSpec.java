package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineSpec {
	default ObjectMeta getMetadata() { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//org.json:taints
	List<Taint> getTaints();
	//org.json:providerSpec
	ProviderSpec getProviderSpec();
	//org.json:versions
	MachineVersionInfo getVersions();
	//org.json:configSource
	NodeConfigSource getConfigSource();
}
