package com.github.openshift.circe.gen;


public enum DefinitionType {

	v4_0_network(com.github.openshift.circe.gen.def.v4_0.NetworkDefinition.class, "network", "v4.0-network"),
	v4_0_project(com.github.openshift.circe.gen.def.v4_0.ProjectConfigDefinition.class, "project", "v4.0-project"),
	v4_0_build(com.github.openshift.circe.gen.def.v4_0.BuildDefinition.class, "build", "v4.0-build"),
	v4_0_auth(com.github.openshift.circe.gen.def.v4_0.AuthDefinition.class, "auth", "v4.0-auth"),
	v4_0_machineconfig(com.github.openshift.circe.gen.def.v4_0.MachineConfigDefinition.class, "machineconfig", "v4.0-machineconfig"),
	v4_0_controlplane(com.github.openshift.circe.gen.def.v4_0.ControlPlaneConfigDefinition.class, "controlplane", "v4.0-controlplane"),
	v4_0_console(com.github.openshift.circe.gen.def.v4_0.ConsoleDefinition.class, "console", "v4.0-console"),
	;

	public Class<?> mustImplementClass;

	public String unitName;

	public String humanName;

	DefinitionType(Class<?> mustImplementClass, String unitName, String humanName) { this.mustImplementClass = mustImplementClass; this.unitName = unitName; this.humanName = humanName; }

}
