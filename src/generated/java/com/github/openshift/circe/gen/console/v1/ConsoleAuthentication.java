// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.console.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConsoleAuthentication extends Bean {

	@YamlPropertyName(value="logoutRedirect")
	String getLogoutRedirect() throws Exception;

	interface EZ extends ConsoleAuthentication {

		@YamlPropertyName(value="logoutRedirect")
		default String getLogoutRedirect() throws Exception { return null; }

	}

}
