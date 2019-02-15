package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TLS extends Bean {

	@YamlPropertyName(value="certificateAuthorities")
	List<CaReference> getCertificateAuthorities() throws Exception;

	interface EZ extends TLS {

		default List<CaReference> getCertificateAuthorities() throws Exception { return null; }

	}

}
