package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ResourceQuotaSpec {
	//json:hard
	Quantity getHard();
	//json:scopes
	List<String> getScopes();
	//json:scopeSelector
	ScopeSelector getScopeSelector();
}
