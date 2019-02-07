package com.github.openshift.circe.gen.machineconfigpool.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IntOrString extends Bean {
	@YamlPropertyName(value="type")
	Long getType() throws Exception;

	@YamlPropertyName(value="intVal")
	Long getIntVal() throws Exception;

	@YamlPropertyName(value="strVal")
	String getStrVal() throws Exception;

}
