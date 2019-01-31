package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface NetworkConfig {
	default String getKind() { return "NetworkConfig"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() { return new ObjectMeta("", "default"); }
	//json:spec
	NetworkConfigSpec getSpec();
}
