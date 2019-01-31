package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface TunedRecommend {
	//json:profile
	String getProfile();
	//json:priority
	Long getPriority();
	//json:match
	List<TunedMatch> getMatch();
}
