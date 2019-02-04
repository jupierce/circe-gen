package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LDAPAttributeMapping extends Bean {
	//json:id
	List<String> getID() throws Exception;
	//json:preferredUsername
	List<String> getPreferredUsername() throws Exception;
	//json:name
	List<String> getName() throws Exception;
	//json:email
	List<String> getEmail() throws Exception;
}
