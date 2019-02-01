package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OpenIDClaims extends Bean {
	//json:preferredUsername
	List<String> getPreferredUsername() throws Exception;
	//json:name
	List<String> getName() throws Exception;
	//json:email
	List<String> getEmail() throws Exception;
}
