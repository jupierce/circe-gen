package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface BuildOverrides extends Bean {
	//json:imageLabels
	List<ImageLabel> getImageLabels() throws Exception;
	//json:nodeSelector
	Map<String,String> getNodeSelector() throws Exception;
	//json:tolerations
	List<Toleration> getTolerations() throws Exception;
}
