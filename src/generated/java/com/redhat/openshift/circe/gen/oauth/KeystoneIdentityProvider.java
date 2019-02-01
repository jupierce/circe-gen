package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface KeystoneIdentityProvider extends Bean {
	//json:oAuthRemoteConnectionInfo
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;
	//json:domainName
	String getDomainName() throws Exception;
}
