package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NamedCertificate extends Bean {

	@YamlPropertyName(value="names")
	List<String> getNames() throws Exception;

	@YamlPropertyName(value="certInfo")
	@YamlPropertyInline
	CertInfo getCertInfo() throws Exception;

	interface EZ extends NamedCertificate {

		@YamlPropertyName(value="names")
		default List<String> getNames() throws Exception { return null; }

		@YamlPropertyName(value="certInfo")
		@YamlPropertyInline
		default CertInfo getCertInfo() throws Exception { return null; }

	}

}
