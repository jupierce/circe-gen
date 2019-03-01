package com.github.openshift.circe.gen.imagepolicyconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ValueCondition extends Bean {

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="set")
	Boolean getSet() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	interface EZ extends ValueCondition {

		@YamlPropertyName(value="key")
		default String getKey() throws Exception { return null; }

		@YamlPropertyName(value="set")
		default Boolean getSet() throws Exception { return null; }

		@YamlPropertyName(value="value")
		default String getValue() throws Exception { return null; }

	}

}
