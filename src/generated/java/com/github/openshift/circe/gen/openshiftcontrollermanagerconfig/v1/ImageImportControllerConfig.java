package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageImportControllerConfig extends Bean {

	@YamlPropertyName(value="maxScheduledImageImportsPerMinute")
	Long getMaxScheduledImageImportsPerMinute() throws Exception;

	@YamlPropertyName(value="disableScheduledImport")
	Boolean getDisableScheduledImport() throws Exception;

	@YamlPropertyName(value="scheduledImageImportMinimumIntervalSeconds")
	Long getScheduledImageImportMinimumIntervalSeconds() throws Exception;

	interface EZ extends ImageImportControllerConfig {

		default Long getMaxScheduledImageImportsPerMinute() throws Exception { return null; }

		default Boolean getDisableScheduledImport() throws Exception { return null; }

		default Long getScheduledImageImportMinimumIntervalSeconds() throws Exception { return null; }

	}

}
