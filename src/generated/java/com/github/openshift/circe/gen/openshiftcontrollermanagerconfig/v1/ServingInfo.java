package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
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

		default String getBindAddress() throws Exception { return null; }

		default String getBindNetwork() throws Exception { return null; }

		default CertInfo getCertInfo() throws Exception { return null; }

		default String getClientCA() throws Exception { return null; }

		default List<NamedCertificate> getNamedCertificates() throws Exception { return null; }

		default String getMinTLSVersion() throws Exception { return null; }

		default List<String> getCipherSuites() throws Exception { return null; }

	}

}
