package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.authentication.*;
import com.github.openshift.circe.gen.oauth.*;
import com.github.openshift.circe.beans.*;

public interface AuthDefinition extends ConfigUnit {

	@RendererOrder(value ="0001")
	Authentication getAuthentication() throws Exception;

	@RendererOrder(value ="0002")
	OAuth getOAuth() throws Exception;


}
