package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineSpec {
	//json:taints
	List<Taint> getTaints();
	//json:providerSpec
	ProviderSpec getProviderSpec();
	//json:versions
	MachineVersionInfo getVersions();
	//json:configSource
	NodeConfigSource getConfigSource();
}
