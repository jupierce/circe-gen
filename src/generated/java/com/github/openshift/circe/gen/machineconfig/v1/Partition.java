// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Partition extends Bean {

	@YamlPropertyName(value="guid")
	String getGUID() throws Exception;

	@YamlPropertyName(value="label")
	String getLabel() throws Exception;

	@YamlPropertyName(value="number")
	Long getNumber() throws Exception;

	@YamlPropertyName(value="size")
	Long getSize() throws Exception;

	@YamlPropertyName(value="start")
	Long getStart() throws Exception;

	@YamlPropertyName(value="typeGuid")
	String getTypeGUID() throws Exception;

	interface EZ extends Partition {

		@YamlPropertyName(value="guid")
		default String getGUID() throws Exception { return null; }

		@YamlPropertyName(value="label")
		default String getLabel() throws Exception { return null; }

		@YamlPropertyName(value="number")
		default Long getNumber() throws Exception { return null; }

		@YamlPropertyName(value="size")
		default Long getSize() throws Exception { return null; }

		@YamlPropertyName(value="start")
		default Long getStart() throws Exception { return null; }

		@YamlPropertyName(value="typeGuid")
		default String getTypeGUID() throws Exception { return null; }

	}

}
