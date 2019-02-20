package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineSetSpec extends Bean {

	@YamlPropertyName(value="replicas")
	Long getReplicas() throws Exception;

	@YamlPropertyName(value="minReadySeconds")
	Long getMinReadySeconds() throws Exception;

	@YamlPropertyName(value="selector")
	LabelSelector getSelector() throws Exception;

	@YamlPropertyName(value="template")
	MachineTemplateSpec getTemplate() throws Exception;

	interface EZ extends MachineSetSpec {

		@YamlPropertyName(value="replicas")
		default Long getReplicas() throws Exception { return null; }

		@YamlPropertyName(value="minReadySeconds")
		default Long getMinReadySeconds() throws Exception { return null; }

		@YamlPropertyName(value="selector")
		default LabelSelector getSelector() throws Exception { return null; }

		@YamlPropertyName(value="template")
		default MachineTemplateSpec getTemplate() throws Exception { return null; }

	}

}
