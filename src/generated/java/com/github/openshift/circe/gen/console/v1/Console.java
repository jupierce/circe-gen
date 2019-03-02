// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.console.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Console extends Bean {

	default String getKind() { return "Console"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	ConsoleSpec getSpec() throws Exception;

	interface EZ extends Console {

		@YamlPropertyName(value="spec")
		default ConsoleSpec getSpec() throws Exception { return null; }

	}

}
