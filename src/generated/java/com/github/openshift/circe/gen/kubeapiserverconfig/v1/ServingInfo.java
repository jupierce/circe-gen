// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ServingInfo extends Bean {

	@YamlPropertyName(value="bindAddress")
	String getBindAddress() throws Exception;

	@YamlPropertyName(value="bindNetwork")
	String getBindNetwork() throws Exception;

	@YamlPropertyName(value="certInfo")
	@YamlPropertyInline
	CertInfo getCertInfo() throws Exception;

	@YamlPropertyName(value="clientCA")
	String getClientCA() throws Exception;

	@YamlPropertyName(value="namedCertificates")
	List<NamedCertificate> getNamedCertificates() throws Exception;

	@YamlPropertyName(value="minTLSVersion")
	String getMinTLSVersion() throws Exception;

	@YamlPropertyName(value="cipherSuites")
	List<String> getCipherSuites() throws Exception;

	interface EZ extends ServingInfo {

		@YamlPropertyName(value="bindAddress")
		default String getBindAddress() throws Exception { return null; }

		@YamlPropertyName(value="bindNetwork")
		default String getBindNetwork() throws Exception { return null; }

		@YamlPropertyName(value="certInfo")
		@YamlPropertyInline
		default CertInfo getCertInfo() throws Exception { return null; }

		@YamlPropertyName(value="clientCA")
		default String getClientCA() throws Exception { return null; }

		@YamlPropertyName(value="namedCertificates")
		default List<NamedCertificate> getNamedCertificates() throws Exception { return null; }

		@YamlPropertyName(value="minTLSVersion")
		default String getMinTLSVersion() throws Exception { return null; }

		@YamlPropertyName(value="cipherSuites")
		default List<String> getCipherSuites() throws Exception { return null; }

	}

}
