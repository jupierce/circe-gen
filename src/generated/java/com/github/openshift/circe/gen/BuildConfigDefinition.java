package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.gen.build.*;
import com.github.openshift.circe.beans.*;

public interface BuildConfigDefinition extends ConfigUnit {

	@RenderOrder(value ="0001")
	Build getBuild() throws Exception;


}
