package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OpenIDClaims extends Bean {
	@YamlPropertyName(value="preferredUsername")
	List<String> getPreferredUsername() throws Exception;

	@YamlPropertyName(value="name")
	List<String> getName() throws Exception;

	@YamlPropertyName(value="email")
	List<String> getEmail() throws Exception;

}
