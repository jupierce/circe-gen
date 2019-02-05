package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDClaims extends Bean {
	//json:preferredUsername
	List<String> getPreferredUsername() throws Exception;
	//json:name
	List<String> getName() throws Exception;
	//json:email
	List<String> getEmail() throws Exception;
}
