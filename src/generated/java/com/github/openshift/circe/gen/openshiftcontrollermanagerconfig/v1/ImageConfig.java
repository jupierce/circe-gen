package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageConfig extends Bean {

	@YamlPropertyName(value="format")
	String getFormat() throws Exception;

	@YamlPropertyName(value="latest")
	Boolean getLatest() throws Exception;

	interface EZ extends ImageConfig {

		default String getFormat() throws Exception { return null; }

		default Boolean getLatest() throws Exception { return null; }

	}

}
