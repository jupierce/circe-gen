package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineTemplateSpec extends Bean {
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-cluster-api"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHit() { return "default"; }
	ObjectMeta getMetadata() throws Exception;
	//json:spec
	MachineSpec getSpec() throws Exception;
}
