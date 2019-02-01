package com.redhat.openshift.circe.gen.rolebindingrestriction;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface RoleBindingRestriction extends Bean {
	default String getKind() { return "RoleBindingRestriction"; }
	default String getApiVersion() { return "v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", ""); }
	//json:spec
	RoleBindingRestrictionSpec getSpec() throws Exception;
}
