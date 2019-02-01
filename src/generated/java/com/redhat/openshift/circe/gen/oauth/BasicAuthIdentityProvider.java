package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface BasicAuthIdentityProvider extends Bean {
	//json:oAuthRemoteConnectionInfo
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;
}
