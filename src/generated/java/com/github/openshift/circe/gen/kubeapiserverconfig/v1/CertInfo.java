package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface CertInfo extends Bean {

	@YamlPropertyName(value="certFile")
	String getCertFile() throws Exception;

	@YamlPropertyName(value="keyFile")
	String getKeyFile() throws Exception;

	interface EZ extends CertInfo {

		@YamlPropertyName(value="certFile")
		default String getCertFile() throws Exception { return null; }

		@YamlPropertyName(value="keyFile")
		default String getKeyFile() throws Exception { return null; }

	}

}
