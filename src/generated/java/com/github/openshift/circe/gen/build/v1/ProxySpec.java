package com.github.openshift.circe.gen.build.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProxySpec extends Bean {

	@YamlPropertyName(value="httpProxy")
	String getHTTPProxy() throws Exception;

	@YamlPropertyName(value="httpsProxy")
	String getHTTPSProxy() throws Exception;

	@YamlPropertyName(value="noProxy")
	String getNoProxy() throws Exception;

	interface EZ extends ProxySpec {

		@YamlPropertyName(value="httpProxy")
		default String getHTTPProxy() throws Exception { return null; }

		@YamlPropertyName(value="httpsProxy")
		default String getHTTPSProxy() throws Exception { return null; }

		@YamlPropertyName(value="noProxy")
		default String getNoProxy() throws Exception { return null; }

	}

}
