package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedRecommend extends Bean {
	@YamlPropertyName(value="profile")
	String getProfile() throws Exception;

	@YamlPropertyName(value="priority")
	Long getPriority() throws Exception;

	@YamlPropertyName(value="match")
	List<TunedMatch> getMatch() throws Exception;

}
