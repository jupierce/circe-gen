package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineTemplateSpec extends Bean {

	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-cluster-api"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "default"; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="spec")
	MachineSpec getSpec() throws Exception;

	interface EZ extends MachineTemplateSpec {

		default MachineSpec getSpec() throws Exception { return null; }

	}

}
