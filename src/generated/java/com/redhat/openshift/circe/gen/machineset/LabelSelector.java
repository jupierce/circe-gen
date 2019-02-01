package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface LabelSelector extends Bean {
	//json:matchLabels
	Map<String,String> getMatchLabels() throws Exception;
	//json:matchExpressions
	List<LabelSelectorRequirement> getMatchExpressions() throws Exception;
}
