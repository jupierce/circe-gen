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

}
