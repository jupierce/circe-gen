package com.redhat.openshift.circe.gen.rolebindingrestriction;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ServiceAccountRestriction extends Bean {
	//json:serviceAccounts
	List<ServiceAccountReference> getServiceAccounts() throws Exception;
	//json:namespaces
	List<String> getNamespaces() throws Exception;
}
