package com.github.openshift.circe.gen;


public enum DefinitionType {

	v4_0_project(com.github.openshift.circe.gen.def.v4_0.ProjectConfigDefinition.class, "v4.0-project"),
	v4_0_build(com.github.openshift.circe.gen.def.v4_0.BuildConfigDefinition.class, "v4.0-build"),
	v4_0_auth(com.github.openshift.circe.gen.def.v4_0.AuthDefinition.class, "v4.0-auth"),
	v4_0_cluster(com.github.openshift.circe.gen.def.v4_0.ClusterDefinition.class, "v4.0-cluster"),
	;

	public Class<?> mustImplementClass;

	public String humanName;

	DefinitionType(Class<?> mustImplementClass, String humanName) { this.mustImplementClass = mustImplementClass; this.humanName = humanName; }

}
