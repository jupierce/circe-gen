package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineTemplateSpec extends Bean {
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSpec getSpec() throws Exception;
}
