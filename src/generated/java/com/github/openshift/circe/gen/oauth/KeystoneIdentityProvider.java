package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KeystoneIdentityProvider extends Bean {
	//json:oAuthRemoteConnectionInfo
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;
	//json:domainName
	String getDomainName() throws Exception;
}
