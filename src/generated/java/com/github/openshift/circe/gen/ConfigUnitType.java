package com.github.openshift.circe.gen;


public enum ConfigUnitType {

	auth(AuthDefinition.class),
	cluster(ClusterDefinition.class),
	project(ProjectConfigDefinition.class),
	;

	public Class<?> mustImplementClass;

	ConfigUnitType(Class<?> mustImplementClass) { this.mustImplementClass = mustImplementClass; }

}
