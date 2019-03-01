package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClientConnectionOverrides extends Bean {

	@YamlPropertyName(value="acceptContentTypes")
	String getAcceptContentTypes() throws Exception;

	@YamlPropertyName(value="contentType")
	String getContentType() throws Exception;

	@YamlPropertyName(value="qps")
	Double getQPS() throws Exception;

	@YamlPropertyName(value="burst")
	Long getBurst() throws Exception;

	interface EZ extends ClientConnectionOverrides {

		@YamlPropertyName(value="acceptContentTypes")
		default String getAcceptContentTypes() throws Exception { return null; }

		@YamlPropertyName(value="contentType")
		default String getContentType() throws Exception { return null; }

		@YamlPropertyName(value="qps")
		default Double getQPS() throws Exception { return null; }

		@YamlPropertyName(value="burst")
		default Long getBurst() throws Exception { return null; }

	}

}
