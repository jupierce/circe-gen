package com.redhat.openshift.circe.gen.resourcequota;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ScopeSelector extends Bean {
	//json:matchExpressions
	List<ScopedResourceSelectorRequirement> getMatchExpressions() throws Exception;
}
