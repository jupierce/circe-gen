package com.github.openshift.circe.gen.tuned;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface TunedSpec extends Bean {
	//json:profile
	List<TunedProfile> getProfile() throws Exception;
	//json:recommend
	List<TunedRecommend> getRecommend() throws Exception;
}
