package com.redhat.openshift.circe.gen;

import java.util.*;
import com.redhat.openshift.circe.gen.tuned.*;
import com.redhat.openshift.circe.gen.machineset.*;
import com.redhat.openshift.circe.gen.networkconfig.*;
import com.redhat.openshift.circe.gen.project.*;
import com.redhat.openshift.circe.gen.template.*;
import com.redhat.openshift.circe.beans.*;

public interface ProjectDefinition {

	Project getProject() throws Exception;

	Template getTemplate() throws Exception;


}
