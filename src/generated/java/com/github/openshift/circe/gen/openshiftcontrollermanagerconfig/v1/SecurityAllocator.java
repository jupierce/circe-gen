package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SecurityAllocator extends Bean {

	@YamlPropertyName(value="uidAllocatorRange")
	String getUIDAllocatorRange() throws Exception;

	@YamlPropertyName(value="mcsAllocatorRange")
	String getMCSAllocatorRange() throws Exception;

	@YamlPropertyName(value="mcsLabelsPerProject")
	Long getMCSLabelsPerProject() throws Exception;

	interface EZ extends SecurityAllocator {

		@YamlPropertyName(value="uidAllocatorRange")
		default String getUIDAllocatorRange() throws Exception { return null; }

		@YamlPropertyName(value="mcsAllocatorRange")
		default String getMCSAllocatorRange() throws Exception { return null; }

		@YamlPropertyName(value="mcsLabelsPerProject")
		default Long getMCSLabelsPerProject() throws Exception { return null; }

	}

}
