package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.tuned.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.networkconfig.*;
import com.redhat.openshift.circe.gen.project.*;
import com.redhat.openshift.circe.gen.template.*;
import com.redhat.openshift.circe.gen.authentication.*;
import com.redhat.openshift.circe.gen.oauth.*;
import com.redhat.openshift.circe.gen.impl.*;

public interface AuthDefinition {

	Authentication getAuthentication() throws Exception;

	OAuth getOAuth() throws Exception;


}
