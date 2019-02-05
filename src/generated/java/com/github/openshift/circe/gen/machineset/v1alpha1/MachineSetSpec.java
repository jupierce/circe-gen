package com.github.openshift.circe.gen.machineset.v1alpha1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineSetSpec extends Bean {
	//json:replicas
	Long getReplicas() throws Exception;
	//json:minReadySeconds
	Long getMinReadySeconds() throws Exception;
	//json:selector
	LabelSelector getSelector() throws Exception;
	//json:template
	MachineTemplateSpec getTemplate() throws Exception;
}
