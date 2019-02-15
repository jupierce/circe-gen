package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Taint extends Bean {

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="effect")
	String getEffect() throws Exception;

	@YamlPropertyName(value="timeAdded")
	Time getTimeAdded() throws Exception;

	interface EZ extends Taint {

		default String getKey() throws Exception { return null; }

		default String getValue() throws Exception { return null; }

		default String getEffect() throws Exception { return null; }

		default Time getTimeAdded() throws Exception { return null; }

	}

}
