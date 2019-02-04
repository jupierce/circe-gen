package com.github.openshift.circe.gen.tuned;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedRecommend extends Bean {
	//json:profile
	String getProfile() throws Exception;
	//json:priority
	Long getPriority() throws Exception;
	//json:match
	List<TunedMatch> getMatch() throws Exception;
}
