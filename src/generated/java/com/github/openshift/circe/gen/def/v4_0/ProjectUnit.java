package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.template.v1.*;
import com.github.openshift.circe.gen.project.v1.*;
import com.github.openshift.circe.beans.*;

public interface ProjectUnit extends Definition {

	@RenderOrder(value ="0001")
	Template getTemplate() throws Exception;

	@RenderOrder(value ="0002")
	Project getProject() throws Exception;

	interface EZ extends ProjectUnit {

		@RenderOrder(value ="0001")
		default Template getTemplate() throws Exception { return null; }

		@RenderOrder(value ="0002")
		default Project getProject() throws Exception { return null; }

	}


}
