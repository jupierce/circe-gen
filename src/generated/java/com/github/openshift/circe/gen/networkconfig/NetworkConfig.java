package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface NetworkConfig extends Bean {
	default String getKind() { return "NetworkConfig"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "default"); }
	//json:spec
	NetworkConfigSpec getSpec() throws Exception;
}
