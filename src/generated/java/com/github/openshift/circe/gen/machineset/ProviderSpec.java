package com.github.openshift.circe.gen.machineset;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProviderSpec extends Bean {
	//json:value
	String getValue() throws Exception;
	//json:valueFrom
	ProviderSpecSource getValueFrom() throws Exception;
}
