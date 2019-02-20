package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface HTPasswdIdentityProvider extends Bean {

	@YamlPropertyName(value="fileData")
	SecretNameReference getFileData() throws Exception;

	interface EZ extends HTPasswdIdentityProvider {

		@YamlPropertyName(value="fileData")
		default SecretNameReference getFileData() throws Exception { return null; }

	}

}
