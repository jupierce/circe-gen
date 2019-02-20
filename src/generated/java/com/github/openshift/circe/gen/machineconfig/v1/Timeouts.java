package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Timeouts extends Bean {

	@YamlPropertyName(value="httpResponseHeaders")
	Long getHTTPResponseHeaders() throws Exception;

	@YamlPropertyName(value="httpTotal")
	Long getHTTPTotal() throws Exception;

	interface EZ extends Timeouts {

		@YamlPropertyName(value="httpResponseHeaders")
		default Long getHTTPResponseHeaders() throws Exception { return null; }

		@YamlPropertyName(value="httpTotal")
		default Long getHTTPTotal() throws Exception { return null; }

	}

}
