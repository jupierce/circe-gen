package com.github.openshift.circe.gen.kubecontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ServiceServingCert extends Bean {

	@YamlPropertyName(value="certFile")
	String getCertFile() throws Exception;

	interface EZ extends ServiceServingCert {

		@YamlPropertyName(value="certFile")
		default String getCertFile() throws Exception { return null; }

	}

}
