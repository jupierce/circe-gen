// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.podnodeselectorconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface PodNodeSelectorConfig extends Bean {

	@YamlPropertyName(value="podNodeSelectorPluginConfig")
	Map<String,String> getPodNodeSelectorPluginConfig() throws Exception;

	interface EZ extends PodNodeSelectorConfig {

		@YamlPropertyName(value="podNodeSelectorPluginConfig")
		default Map<String,String> getPodNodeSelectorPluginConfig() throws Exception { return null; }

	}

}
