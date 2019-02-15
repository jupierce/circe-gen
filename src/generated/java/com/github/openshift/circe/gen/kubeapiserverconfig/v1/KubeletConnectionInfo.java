package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeletConnectionInfo extends Bean {

	@YamlPropertyName(value="port")
	Long getPort() throws Exception;

	@YamlPropertyName(value="ca")
	String getCA() throws Exception;

	@YamlPropertyName(value="certInfo")
	@YamlPropertyInline
	CertInfo getCertInfo() throws Exception;

	interface EZ extends KubeletConnectionInfo {

		default Long getPort() throws Exception { return null; }

		default String getCA() throws Exception { return null; }

		default CertInfo getCertInfo() throws Exception { return null; }

	}

}
