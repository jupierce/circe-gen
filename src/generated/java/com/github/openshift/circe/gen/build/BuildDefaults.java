package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildDefaults extends Bean {
	//json:defaultProxy
	ProxySpec getDefaultProxy() throws Exception;
	//json:gitProxy
	ProxySpec getGitProxy() throws Exception;
	//json:env
	List<EnvVar> getEnv() throws Exception;
	//json:imageLabels
	List<ImageLabel> getImageLabels() throws Exception;
	//json:resources
	ResourceRequirements getResources() throws Exception;
	//json:registriesConfig
	RegistriesConfig getRegistriesConfig() throws Exception;
}
