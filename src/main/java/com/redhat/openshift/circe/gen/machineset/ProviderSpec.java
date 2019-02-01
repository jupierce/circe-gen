package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface ProviderSpec extends Bean {
	//json:value
	String getValue() throws Exception;
	//json:valueFrom
	ProviderSpecSource getValueFrom() throws Exception;
}
