package com.github.openshift.circe.gen;


public enum ConfigUnit {

	cluster(ClusterDefinition.class),
	project(ProjectConfigDefinition.class),
	auth(AuthDefinition.class),
	;

	public Class<?> mustImplementClass;

	ConfigUnit(Class<?> mustImplementClass) { this.mustImplementClass = mustImplementClass; }

}
