package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface TunedMatch extends Bean {
	//json:label
	String getLabel() throws Exception;
	//json:value
	String getValue() throws Exception;
	//json:type
	String getType() throws Exception;
	//json:match
	List<TunedMatch> getMatch() throws Exception;
}
