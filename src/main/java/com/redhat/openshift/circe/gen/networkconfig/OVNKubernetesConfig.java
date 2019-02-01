package com.redhat.openshift.circe.gen.networkconfig;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OVNKubernetesConfig extends Bean {
	//json:genevePort
	Long getGenevePort() throws Exception;
	//json:mtu
	Long getMTU() throws Exception;
}
