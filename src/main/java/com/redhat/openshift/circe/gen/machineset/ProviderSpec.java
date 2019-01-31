package com.redhat.openshift.circe.gen.machineset;

import java.util.*;

public interface ProviderSpec {
	//json:value
	String getValue();
	//json:valueFrom
	ProviderSpecSource getValueFrom();
}
