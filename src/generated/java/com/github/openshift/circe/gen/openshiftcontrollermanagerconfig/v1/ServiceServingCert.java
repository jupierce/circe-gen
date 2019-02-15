package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ServiceServingCert extends Bean {
	@YamlPropertyName(value="signer")
	CertInfo getSigner() throws Exception;

}
