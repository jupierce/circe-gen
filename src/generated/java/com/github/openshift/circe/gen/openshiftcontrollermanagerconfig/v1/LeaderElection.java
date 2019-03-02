package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LeaderElection extends Bean {

	@YamlPropertyName(value="disable")
	Boolean getDisable() throws Exception;

	@YamlPropertyName(value="namespace")
	String getNamespace() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="leaseDuration")
	Duration getLeaseDuration() throws Exception;

	@YamlPropertyName(value="renewDeadline")
	Duration getRenewDeadline() throws Exception;

	@YamlPropertyName(value="retryPeriod")
	Duration getRetryPeriod() throws Exception;

	interface EZ extends LeaderElection {

		@YamlPropertyName(value="disable")
		default Boolean getDisable() throws Exception { return null; }

		@YamlPropertyName(value="namespace")
		default String getNamespace() throws Exception { return null; }

		@YamlPropertyName(value="name")
		default String getName() throws Exception { return null; }

		@YamlPropertyName(value="leaseDuration")
		default Duration getLeaseDuration() throws Exception { return null; }

		@YamlPropertyName(value="renewDeadline")
		default Duration getRenewDeadline() throws Exception { return null; }

		@YamlPropertyName(value="retryPeriod")
		default Duration getRetryPeriod() throws Exception { return null; }

	}

}
