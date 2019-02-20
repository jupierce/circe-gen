package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OVNKubernetesConfig extends Bean {

	@YamlPropertyName(value="genevePort")
	Long getGenevePort() throws Exception;

	@YamlPropertyName(value="mtu")
	Long getMTU() throws Exception;

	interface EZ extends OVNKubernetesConfig {

		@YamlPropertyName(value="genevePort")
		default Long getGenevePort() throws Exception { return null; }

		@YamlPropertyName(value="mtu")
		default Long getMTU() throws Exception { return null; }

	}

}
