// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.genericapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface EtcdConnectionInfo extends Bean {

	@YamlPropertyName(value="urls")
	List<String> getURLs() throws Exception;

	@YamlPropertyName(value="ca")
	String getCA() throws Exception;

	@YamlPropertyName(value="certInfo")
	@YamlPropertyInline
	CertInfo getCertInfo() throws Exception;

	interface EZ extends EtcdConnectionInfo {

		@YamlPropertyName(value="urls")
		default List<String> getURLs() throws Exception { return null; }

		@YamlPropertyName(value="ca")
		default String getCA() throws Exception { return null; }

		@YamlPropertyName(value="certInfo")
		@YamlPropertyInline
		default CertInfo getCertInfo() throws Exception { return null; }

	}

}
