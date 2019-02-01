package com.redhat.openshift.circe.gen.rolebindingrestriction;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface UserRestriction extends Bean {
	//json:users
	List<String> getUsers() throws Exception;
	//json:groups
	List<String> getGroups() throws Exception;
	//json:selectors
	List<LabelSelector> getSelectors() throws Exception;
}
