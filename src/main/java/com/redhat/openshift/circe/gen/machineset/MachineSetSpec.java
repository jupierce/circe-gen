package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
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
