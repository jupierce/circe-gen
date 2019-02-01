package com.redhat.openshift.circe.gen.rolebindingrestriction;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface RoleBindingRestrictionSpec extends Bean {
	//json:userRestriction
	UserRestriction getUserRestriction() throws Exception;
	//json:groupRestriction
	GroupRestriction getGroupRestriction() throws Exception;
	//json:serviceAccountRestriction
	ServiceAccountRestriction getServiceAccountRestriction() throws Exception;
}
