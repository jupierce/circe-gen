package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface TunedMatch {
	//json:label
	String getLabel();
	//json:value
	String getValue();
	//json:type
	String getType();
	//json:match
	List<TunedMatch> getMatch();
}
