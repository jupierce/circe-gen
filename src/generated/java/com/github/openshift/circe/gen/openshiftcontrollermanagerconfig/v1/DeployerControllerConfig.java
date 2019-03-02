package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface DeployerControllerConfig extends Bean {

	@YamlPropertyName(value="imageTemplateFormat")
	ImageConfig getImageTemplateFormat() throws Exception;

	interface EZ extends DeployerControllerConfig {

		@YamlPropertyName(value="imageTemplateFormat")
		default ImageConfig getImageTemplateFormat() throws Exception { return null; }

	}

}
