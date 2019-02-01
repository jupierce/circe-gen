package com.github.openshift.circe.gen.oauth;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface HTPasswdIdentityProvider extends Bean {
	//json:fileData
	SecretNameReference getFileData() throws Exception;
}
