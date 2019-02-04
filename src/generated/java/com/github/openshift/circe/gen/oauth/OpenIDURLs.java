package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDURLs extends Bean {
	//json:authorize
	String getAuthorize() throws Exception;
	//json:token
	String getToken() throws Exception;
	//json:userInfo
	String getUserInfo() throws Exception;
}
