package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceQuotaControllerConfig extends Bean {

	@YamlPropertyName(value="concurrentSyncs")
	Long getConcurrentSyncs() throws Exception;

	@YamlPropertyName(value="syncPeriod")
	Duration getSyncPeriod() throws Exception;

	@YamlPropertyName(value="minResyncPeriod")
	Duration getMinResyncPeriod() throws Exception;

	interface EZ extends ResourceQuotaControllerConfig {

		@YamlPropertyName(value="concurrentSyncs")
		default Long getConcurrentSyncs() throws Exception { return null; }

		@YamlPropertyName(value="syncPeriod")
		default Duration getSyncPeriod() throws Exception { return null; }

		@YamlPropertyName(value="minResyncPeriod")
		default Duration getMinResyncPeriod() throws Exception { return null; }

	}

}
