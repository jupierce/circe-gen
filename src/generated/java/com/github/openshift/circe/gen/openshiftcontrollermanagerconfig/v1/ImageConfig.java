// GENERATED FILE -- DO NOT ALTER (circe.go)

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

		@YamlPropertyName(value="format")
		default String getFormat() throws Exception { return null; }

		@YamlPropertyName(value="latest")
		default Boolean getLatest() throws Exception { return null; }

	}

}
