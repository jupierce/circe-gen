package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineVersionInfo extends Bean {

	@YamlPropertyName(value="kubelet")
	String getKubelet() throws Exception;

	@YamlPropertyName(value="controlPlane")
	String getControlPlane() throws Exception;

	interface EZ extends MachineVersionInfo {

		@YamlPropertyName(value="kubelet")
		default String getKubelet() throws Exception { return null; }

		@YamlPropertyName(value="controlPlane")
		default String getControlPlane() throws Exception { return null; }

	}

}
