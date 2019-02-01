package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ResourceQuotaSpec extends Bean {
	//json:hard
	Quantity getHard() throws Exception;
	//json:scopes
	List<String> getScopes() throws Exception;
	//json:scopeSelector
	ScopeSelector getScopeSelector() throws Exception;
}
