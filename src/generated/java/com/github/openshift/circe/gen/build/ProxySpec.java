package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProxySpec extends Bean {
	//json:httpProxy
	String getHTTPProxy() throws Exception;
	//json:httpsProxy
	String getHTTPSProxy() throws Exception;
	//json:noProxy
	String getNoProxy() throws Exception;
}
