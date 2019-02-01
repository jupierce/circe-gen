package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface HTPasswdIdentityProvider extends Bean {
	//json:fileData
	SecretNameReference getFileData() throws Exception;
}
