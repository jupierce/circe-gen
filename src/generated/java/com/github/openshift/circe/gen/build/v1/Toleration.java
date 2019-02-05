package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Toleration extends Bean {
	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="operator")
	String getOperator() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="effect")
	String getEffect() throws Exception;

	@YamlPropertyName(value="tolerationSeconds")
	Long getTolerationSeconds() throws Exception;

}
