package com.redhat.openshift.circe.gen.machineset;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface ProviderSpec {
	//json:value
	String getValue();
	//json:valueFrom
	ProviderSpecSource getValueFrom();
}
