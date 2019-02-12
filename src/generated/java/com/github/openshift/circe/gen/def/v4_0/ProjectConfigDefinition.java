package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.template.v1.*;
import com.github.openshift.circe.gen.project.v1.*;
import com.github.openshift.circe.beans.*;

public interface ProjectConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	Template getTemplate() throws Exception;

	@RenderOrder(value ="0002")
	Project getProject() throws Exception;


}
