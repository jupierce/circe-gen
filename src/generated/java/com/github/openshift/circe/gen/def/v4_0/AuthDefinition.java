package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.authentication.v1.*;
import com.github.openshift.circe.gen.oauth.v1.*;
import com.github.openshift.circe.beans.*;

public interface AuthDefinition extends Definition {

	@RenderOrder(value ="0001")
	Authentication getAuthentication() throws Exception;

	@RenderOrder(value ="0002")
	OAuth getOAuth() throws Exception;

	@RenderOrder(value ="0003")
	KubeList<Secret> getSecretList() throws Exception;


}
