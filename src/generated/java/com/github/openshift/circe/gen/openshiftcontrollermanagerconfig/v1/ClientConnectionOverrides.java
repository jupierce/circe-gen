package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
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

}
