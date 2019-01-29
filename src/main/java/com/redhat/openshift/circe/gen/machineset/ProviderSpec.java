package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface ProviderSpec {
	//org.json:value
	String getValue();
	//org.json:valueFrom
	ProviderSpecSource getValueFrom();
}
