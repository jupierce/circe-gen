package com.github.openshift.circe.gen.tuned.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface TunedProfile extends Bean {
	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="data")
	String getData() throws Exception;

}
