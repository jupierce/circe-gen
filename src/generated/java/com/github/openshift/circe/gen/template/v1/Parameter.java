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

}
