package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageLabel extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	interface EZ extends ImageLabel {

		default String getName() throws Exception { return null; }

		default String getValue() throws Exception { return null; }

	}

}
