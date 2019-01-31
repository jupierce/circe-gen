package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ScopeSelector {
	//json:matchExpressions
	List<ScopedResourceSelectorRequirement> getMatchExpressions();
}
