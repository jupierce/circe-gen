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

		default String getGUID() throws Exception { return null; }

		default String getLabel() throws Exception { return null; }

		default Long getNumber() throws Exception { return null; }

		default Long getSize() throws Exception { return null; }

		default Long getStart() throws Exception { return null; }

		default String getTypeGUID() throws Exception { return null; }

	}

}
