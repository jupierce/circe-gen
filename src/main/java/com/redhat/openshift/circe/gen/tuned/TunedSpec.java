package com.redhat.openshift.circe.gen.tuned;

import java.util.*;

public interface TunedSpec {
	//org.json:profile
	List<TunedProfile> getProfile();
	//org.json:recommend
	List<TunedRecommend> getRecommend();
}
