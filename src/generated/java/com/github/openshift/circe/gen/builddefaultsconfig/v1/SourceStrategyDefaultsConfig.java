package com.github.openshift.circe.gen.builddefaultsconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SourceStrategyDefaultsConfig extends Bean {

	@YamlPropertyName(value="incremental")
	Boolean getIncremental() throws Exception;

	interface EZ extends SourceStrategyDefaultsConfig {

		default Boolean getIncremental() throws Exception { return null; }

	}

}
