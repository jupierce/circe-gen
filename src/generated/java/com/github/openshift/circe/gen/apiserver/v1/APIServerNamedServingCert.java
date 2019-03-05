// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.apiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface APIServerNamedServingCert extends Bean {

	@YamlPropertyName(value="names")
	List<String> getNames() throws Exception;

	@YamlPropertyName(value="servingCertificate")
	SecretNameReference getServingCertificate() throws Exception;

	interface EZ extends APIServerNamedServingCert {

		@YamlPropertyName(value="names")
		default List<String> getNames() throws Exception { return null; }

		@YamlPropertyName(value="servingCertificate")
		default SecretNameReference getServingCertificate() throws Exception { return null; }

	}

}
