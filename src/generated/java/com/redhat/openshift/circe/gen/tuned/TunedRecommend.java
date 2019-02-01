package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface TunedRecommend extends Bean {
	//json:profile
	String getProfile() throws Exception;
	//json:priority
	Long getPriority() throws Exception;
	//json:match
	List<TunedMatch> getMatch() throws Exception;
}
