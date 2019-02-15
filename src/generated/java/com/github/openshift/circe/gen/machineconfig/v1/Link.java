package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Link extends Bean {

	@YamlPropertyName(value="node")
	@YamlPropertyInline
	Node getNode() throws Exception;

	@YamlPropertyName(value="linkEmbedded1")
	@YamlPropertyInline
	LinkEmbedded1 getLinkEmbedded1() throws Exception;

	interface EZ extends Link {

		default Node getNode() throws Exception { return null; }

		default LinkEmbedded1 getLinkEmbedded1() throws Exception { return null; }

	}

}
