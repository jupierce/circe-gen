package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDURLs extends Bean {

	@YamlPropertyName(value="authorize")
	String getAuthorize() throws Exception;

	@YamlPropertyName(value="token")
	String getToken() throws Exception;

	@YamlPropertyName(value="userInfo")
	String getUserInfo() throws Exception;

	interface EZ extends OpenIDURLs {

		default String getAuthorize() throws Exception { return null; }

		default String getToken() throws Exception { return null; }

		default String getUserInfo() throws Exception { return null; }

	}

}
