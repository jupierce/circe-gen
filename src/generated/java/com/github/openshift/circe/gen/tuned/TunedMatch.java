package com.github.openshift.circe.gen.tuned;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
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
