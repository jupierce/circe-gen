// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.apiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface APIServerSpec extends Bean {

	@YamlPropertyName(value="servingCerts")
	APIServerServingCerts getServingCerts() throws Exception;

	@YamlPropertyName(value="clientCA")
	ConfigMapNameReference getClientCA() throws Exception;

	interface EZ extends APIServerSpec {

		@YamlPropertyName(value="servingCerts")
		default APIServerServingCerts getServingCerts() throws Exception { return null; }

		@YamlPropertyName(value="clientCA")
		default ConfigMapNameReference getClientCA() throws Exception { return null; }

	}

}
