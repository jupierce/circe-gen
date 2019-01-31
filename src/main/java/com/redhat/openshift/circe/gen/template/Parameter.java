package com.redhat.openshift.circe.gen.template;

import com.redhat.openshift.circe.gen.impl.*;
import java.util.*;

public interface Parameter {
	//json:name
	String getName();
	//json:displayName
	String getDisplayName();
	//json:description
	String getDescription();
	//json:value
	String getValue();
	//json:generate
	String getGenerate();
	//json:from
	String getFrom();
	//json:required
	Boolean getRequired();
}
