package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface MachineSetSpec {
	//org.json:replicas
	Long getReplicas();
	//org.json:minReadySeconds
	Long getMinReadySeconds();
	//org.json:selector
	LabelSelector getSelector();
	//org.json:template
	MachineTemplateSpec getTemplate();
}
