package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineClassRef extends Bean {

	@YamlPropertyName(value="objectReference")
	@YamlPropertyInline
	ObjectReference getObjectReference() throws Exception;

	@YamlPropertyName(value="provider")
	String getProvider() throws Exception;

	interface EZ extends MachineClassRef {

		@YamlPropertyName(value="objectReference")
		@YamlPropertyInline
		default ObjectReference getObjectReference() throws Exception { return null; }

		@YamlPropertyName(value="provider")
		default String getProvider() throws Exception { return null; }

	}

}
