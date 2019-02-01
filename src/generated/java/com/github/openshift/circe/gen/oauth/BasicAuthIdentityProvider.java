package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface BasicAuthIdentityProvider extends Bean {
	//json:oAuthRemoteConnectionInfo
	OAuthRemoteConnectionInfo getOAuthRemoteConnectionInfo() throws Exception;
}
