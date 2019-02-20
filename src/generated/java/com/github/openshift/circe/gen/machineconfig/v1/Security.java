package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Security extends Bean {

	@YamlPropertyName(value="tls")
	TLS getTLS() throws Exception;

	interface EZ extends Security {

		@YamlPropertyName(value="tls")
		default TLS getTLS() throws Exception { return null; }

	}

}
