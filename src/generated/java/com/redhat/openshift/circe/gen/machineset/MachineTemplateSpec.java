package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface MachineTemplateSpec extends Bean {
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("openshift-cluster-node-tuning-operator", "default"); }
	//json:spec
	MachineSpec getSpec() throws Exception;
}
