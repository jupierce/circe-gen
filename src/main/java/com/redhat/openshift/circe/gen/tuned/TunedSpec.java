package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface TunedSpec {
	//json:profile
	List<TunedProfile> getProfile();
	//json:recommend
	List<TunedRecommend> getRecommend();
}
