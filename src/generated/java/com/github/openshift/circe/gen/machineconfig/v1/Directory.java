package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Directory extends Bean {

	@YamlPropertyName(value="node")
	@YamlPropertyInline
	Node getNode() throws Exception;

	@YamlPropertyName(value="directoryEmbedded1")
	@YamlPropertyInline
	DirectoryEmbedded1 getDirectoryEmbedded1() throws Exception;

	interface EZ extends Directory {

		@YamlPropertyName(value="node")
		@YamlPropertyInline
		default Node getNode() throws Exception { return null; }

		@YamlPropertyName(value="directoryEmbedded1")
		@YamlPropertyInline
		default DirectoryEmbedded1 getDirectoryEmbedded1() throws Exception { return null; }

	}

}
