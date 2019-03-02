// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.clusterresourceoverrideconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterResourceOverrideConfig extends Bean {

	default String getKind() { return "ClusterResourceOverrideConfig"; }
	default String getApiVersion() { return "autoscaling.openshift.io/v1"; }
	@YamlPropertyName(value="limitCPUToMemoryPercent")
	Long getLimitCPUToMemoryPercent() throws Exception;

	@YamlPropertyName(value="cpuRequestToLimitPercent")
	Long getCPURequestToLimitPercent() throws Exception;

	@YamlPropertyName(value="memoryRequestToLimitPercent")
	Long getMemoryRequestToLimitPercent() throws Exception;

	interface EZ extends ClusterResourceOverrideConfig {

		@YamlPropertyName(value="limitCPUToMemoryPercent")
		default Long getLimitCPUToMemoryPercent() throws Exception { return null; }

		@YamlPropertyName(value="cpuRequestToLimitPercent")
		default Long getCPURequestToLimitPercent() throws Exception { return null; }

		@YamlPropertyName(value="memoryRequestToLimitPercent")
		default Long getMemoryRequestToLimitPercent() throws Exception { return null; }

	}

}
