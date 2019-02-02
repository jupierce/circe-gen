package com.github.openshift.circe.gen;


public enum ConfigUnitType {

	cluster(ClusterDefinition.class),
	project(ProjectConfigDefinition.class),
	auth(AuthDefinition.class),
	;

	public Class<?> mustImplementClass;

	ConfigUnitType(Class<?> mustImplementClass) { this.mustImplementClass = mustImplementClass; }

}
