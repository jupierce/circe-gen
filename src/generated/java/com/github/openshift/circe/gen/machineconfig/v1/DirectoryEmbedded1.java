// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface DirectoryEmbedded1 extends Bean {

	@YamlPropertyName(value="mode")
	Long getMode() throws Exception;

	interface EZ extends DirectoryEmbedded1 {

		@YamlPropertyName(value="mode")
		default Long getMode() throws Exception { return null; }

	}

}
