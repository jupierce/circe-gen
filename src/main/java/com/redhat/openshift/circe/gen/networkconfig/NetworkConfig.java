package com.redhat.openshift.circe.gen.networkconfig;

import java.util.*;

public interface NetworkConfig {
	default String getKind() { return "NetworkConfig"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("", "default"); }
	//org.json:spec
	NetworkConfigSpec getSpec();
}
