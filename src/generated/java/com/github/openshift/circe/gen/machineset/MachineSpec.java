package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineSpec extends Bean {
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-cluster-api"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHit() { return "default"; }
	ObjectMeta getMetadata() throws Exception;
	//json:taints
	List<Taint> getTaints() throws Exception;
	//json:providerSpec
	ProviderSpec getProviderSpec() throws Exception;
	//json:versions
	MachineVersionInfo getVersions() throws Exception;
	//json:configSource
	NodeConfigSource getConfigSource() throws Exception;
}
