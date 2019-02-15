package com.github.openshift.circe.gen.template.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Parameter extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="displayName")
	String getDisplayName() throws Exception;

	@YamlPropertyName(value="description")
	String getDescription() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="generate")
	String getGenerate() throws Exception;

	@YamlPropertyName(value="from")
	String getFrom() throws Exception;

	@YamlPropertyName(value="required")
	Boolean getRequired() throws Exception;

	interface EZ extends Parameter {

		default String getName() throws Exception { return null; }

		default String getDisplayName() throws Exception { return null; }

		default String getDescription() throws Exception { return null; }

		default String getValue() throws Exception { return null; }

		default String getGenerate() throws Exception { return null; }

		default String getFrom() throws Exception { return null; }

		default Boolean getRequired() throws Exception { return null; }

	}

}
