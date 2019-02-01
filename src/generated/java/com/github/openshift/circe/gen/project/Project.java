package com.github.openshift.circe.gen.project;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.Bean;
import java.util.*;

public interface Project extends Bean {
	default String getKind() { return "Project"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta("", "cluster"); }
	//json:spec
	ProjectSpec getSpec() throws Exception;
}
