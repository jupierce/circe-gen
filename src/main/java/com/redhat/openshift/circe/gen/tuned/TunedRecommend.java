package com.redhat.openshift.circe.gen.tuned;

import java.util.*;

public interface TunedRecommend {
	//org.json:profile
	String getProfile();
	//org.json:priority
	Long getPriority();
	//org.json:match
	List<TunedMatch> getMatch();
}
