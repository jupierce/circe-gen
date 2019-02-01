package com.redhat.openshift.circe.gen.tuned;

import com.redhat.openshift.circe.beans.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface TunedSpec extends Bean {
	//json:profile
	List<TunedProfile> getProfile() throws Exception;
	//json:recommend
	List<TunedRecommend> getRecommend() throws Exception;
}
