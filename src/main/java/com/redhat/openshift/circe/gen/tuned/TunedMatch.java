package com.redhat.openshift.circe.gen.tuned;

import java.util.*;

public interface TunedMatch {
	//org.json:label
	String getLabel();
	//org.json:value
	String getValue();
	//org.json:type
	String getType();
	//org.json:match
	List<TunedMatch> getMatch();
}
