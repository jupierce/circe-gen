package com.github.openshift.circe.gen.secret;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Secret extends Bean {
	default String getKind() { return "Secret"; }
	default String getApiVersion() { return "v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-config"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return ""; }
	ObjectMeta getMetadata() throws Exception;
	//json:data
	Map<String,List<Long>> getData() throws Exception;
	//json:stringData
	Map<String,String> getStringData() throws Exception;
	//json:type
	String getType() throws Exception;
}
