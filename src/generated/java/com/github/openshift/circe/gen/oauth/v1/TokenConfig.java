package com.github.openshift.circe.gen.oauth.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TokenConfig extends Bean {
	//json:accessTokenMaxAgeSeconds
	Long getAccessTokenMaxAgeSeconds() throws Exception;
	//json:accessTokenInactivityTimeoutSeconds
	Long getAccessTokenInactivityTimeoutSeconds() throws Exception;
}
