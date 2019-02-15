package com.github.openshift.circe.gen.buildoverridesconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ImageLabel extends Bean {
	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

}
