package com.github.openshift.circe.gen;


public enum ConfigUnit {

	auth(AuthDefinition.class),
	cluster(ClusterDefinition.class),
	project(ProjectConfigDefinition.class),
	;

	public Class<?> mustImplementClass;

	ConfigUnit(Class<?> mustImplementClass) { this.mustImplementClass = mustImplementClass; }

}
