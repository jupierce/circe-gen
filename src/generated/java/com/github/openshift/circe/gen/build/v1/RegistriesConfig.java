package com.github.openshift.circe.gen.build.v1;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface RegistriesConfig extends Bean {
	//json:searchRegistries
	List<String> getSearchRegistries() throws Exception;
	//json:insecureRegistries
	List<String> getInsecureRegistries() throws Exception;
	//json:blockedRegistries
	List<String> getBlockedRegistries() throws Exception;
	//json:allowedRegistries
	List<String> getAllowedRegistries() throws Exception;
}
