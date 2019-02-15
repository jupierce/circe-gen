package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
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

}
