package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface MachineSetSpec {
	//json:replicas
	Long getReplicas();
	//json:minReadySeconds
	Long getMinReadySeconds();
	//json:selector
	LabelSelector getSelector();
	//json:template
	MachineTemplateSpec getTemplate();
}
