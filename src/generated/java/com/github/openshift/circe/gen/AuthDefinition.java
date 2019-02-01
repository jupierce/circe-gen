package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.authentication.*;
import com.github.openshift.circe.gen.oauth.*;
import com.github.openshift.circe.beans.*;

public interface AuthDefinition extends ConfigUnit {

	Authentication getAuthentication() throws Exception;

	OAuth getOAuth() throws Exception;


}
