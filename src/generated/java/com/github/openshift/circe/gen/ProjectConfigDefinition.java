package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.project.*;
import com.github.openshift.circe.gen.template.*;
import com.github.openshift.circe.beans.*;

public interface ProjectConfigDefinition {

	Project getProject() throws Exception;

	Template getTemplate() throws Exception;


}
