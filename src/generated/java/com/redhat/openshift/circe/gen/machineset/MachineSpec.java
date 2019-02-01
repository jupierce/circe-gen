package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineSpec extends Bean {
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:taints
	List<Taint> getTaints() throws Exception;
	//json:providerSpec
	ProviderSpec getProviderSpec() throws Exception;
	//json:versions
	MachineVersionInfo getVersions() throws Exception;
	//json:configSource
	NodeConfigSource getConfigSource() throws Exception;
}
