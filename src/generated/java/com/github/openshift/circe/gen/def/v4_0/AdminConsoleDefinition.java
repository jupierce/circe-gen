package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.console.v1.*;
import com.github.openshift.circe.gen.console.v1.*;
import com.github.openshift.circe.beans.*;

public interface AdminConsoleDefinition extends Definition {

	@RenderOrder(value ="0001")
	Console getConsole() throws Exception;

	@RenderOrder(value ="0002")
	ConsoleOperator getConsoleOperator() throws Exception;

	interface EZ extends AdminConsoleDefinition {

		default Console getConsole() throws Exception { return null; }

		default ConsoleOperator getConsoleOperator() throws Exception { return null; }

	}


}
