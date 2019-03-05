// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.apiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface APIServerServingCerts extends Bean {

	@YamlPropertyName(value="defaultServingCertificate")
	SecretNameReference getDefaultServingCertificate() throws Exception;

	@YamlPropertyName(value="namedCertificates")
	List<APIServerNamedServingCert> getNamedCertificates() throws Exception;

	interface EZ extends APIServerServingCerts {

		@YamlPropertyName(value="defaultServingCertificate")
		default SecretNameReference getDefaultServingCertificate() throws Exception { return null; }

		@YamlPropertyName(value="namedCertificates")
		default List<APIServerNamedServingCert> getNamedCertificates() throws Exception { return null; }

	}

}
