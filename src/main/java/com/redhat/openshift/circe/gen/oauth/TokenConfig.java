package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface TokenConfig extends Bean {
	//json:accessTokenMaxAgeSeconds
	Long getAccessTokenMaxAgeSeconds() throws Exception;
	//json:accessTokenInactivityTimeoutSeconds
	Long getAccessTokenInactivityTimeoutSeconds() throws Exception;
}
