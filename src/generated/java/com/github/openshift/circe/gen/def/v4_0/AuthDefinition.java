package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.authentication.v1.*;
import com.github.openshift.circe.gen.oauth.v1.*;
import com.github.openshift.circe.beans.*;

public interface AuthDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeList<Secret> getSecretList() throws Exception;

	@RenderOrder(value ="0002")
	Authentication getAuthentication() throws Exception;

	@RenderOrder(value ="0003")
	OAuth getOAuth() throws Exception;


}
