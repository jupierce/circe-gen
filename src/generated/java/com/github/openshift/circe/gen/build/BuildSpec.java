package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildSpec extends Bean {
	//json:additionalTrustedCA
	ConfigMapNameReference getAdditionalTrustedCA() throws Exception;
	//json:buildDefaults
	BuildDefaults getBuildDefaults() throws Exception;
	//json:buildOverrides
	BuildOverrides getBuildOverrides() throws Exception;
}
