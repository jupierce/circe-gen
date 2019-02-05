package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OVNKubernetesConfig extends Bean {
	@YamlPropertyName(value="genevePort")
	Long getGenevePort() throws Exception;

	@YamlPropertyName(value="mtu")
	Long getMTU() throws Exception;

}
