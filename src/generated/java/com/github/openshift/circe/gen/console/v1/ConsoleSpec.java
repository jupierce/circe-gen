// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.console.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ConsoleSpec extends Bean {

	@YamlPropertyName(value="authentication")
	ConsoleAuthentication getAuthentication() throws Exception;

	interface EZ extends ConsoleSpec {

		@YamlPropertyName(value="authentication")
		default ConsoleAuthentication getAuthentication() throws Exception { return null; }

	}

}
