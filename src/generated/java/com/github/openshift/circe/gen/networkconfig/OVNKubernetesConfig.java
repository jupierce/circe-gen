package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface OVNKubernetesConfig extends Bean {
	//json:genevePort
	Long getGenevePort() throws Exception;
	//json:mtu
	Long getMTU() throws Exception;
}
