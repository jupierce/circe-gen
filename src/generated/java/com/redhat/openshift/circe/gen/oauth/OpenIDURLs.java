package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OpenIDURLs extends Bean {
	//json:authorize
	String getAuthorize() throws Exception;
	//json:token
	String getToken() throws Exception;
	//json:userInfo
	String getUserInfo() throws Exception;
}
