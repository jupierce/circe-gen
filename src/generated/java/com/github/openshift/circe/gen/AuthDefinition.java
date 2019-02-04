package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.authentication.*;
import com.github.openshift.circe.gen.oauth.*;
import com.github.openshift.circe.gen.secret.*;
import com.github.openshift.circe.beans.*;

public interface AuthDefinition extends ConfigUnit {

	@RenderOrder(value ="0001")
	Authentication getAuthentication() throws Exception;

	@RenderOrder(value ="0002")
	OAuth getOAuth() throws Exception;

	@RenderOrder(value ="0003")
	KubeList<Secret> getSecretList() throws Exception;


}
