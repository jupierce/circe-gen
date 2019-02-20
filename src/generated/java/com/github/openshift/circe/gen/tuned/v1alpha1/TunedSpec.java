package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedSpec extends Bean {

	@YamlPropertyName(value="profile")
	List<TunedProfile> getProfile() throws Exception;

	@YamlPropertyName(value="recommend")
	List<TunedRecommend> getRecommend() throws Exception;

	interface EZ extends TunedSpec {

		@YamlPropertyName(value="profile")
		default List<TunedProfile> getProfile() throws Exception { return null; }

		@YamlPropertyName(value="recommend")
		default List<TunedRecommend> getRecommend() throws Exception { return null; }

	}

}
