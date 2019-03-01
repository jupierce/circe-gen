package com.github.openshift.circe.gen.runoncedurationconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RunOnceDurationConfig extends Bean {

	default String getKind() { return "RunOnceDurationConfig"; }
	default String getApiVersion() { return "autoscaling.openshift.io/v1"; }
	@YamlPropertyName(value="activeDeadlineSecondsLimit")
	Long getActiveDeadlineSecondsLimit() throws Exception;

	interface EZ extends RunOnceDurationConfig {

		@YamlPropertyName(value="activeDeadlineSecondsLimit")
		default Long getActiveDeadlineSecondsLimit() throws Exception { return null; }

	}

}
