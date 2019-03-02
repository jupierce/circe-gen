package com.github.openshift.circe.gen;


public enum DefinitionType {

	v4_0_network(com.github.openshift.circe.gen.def.v4_0.NetworkUnit.class, "network", "v4.0-network"),
	v4_0_project(com.github.openshift.circe.gen.def.v4_0.ProjectUnit.class, "project", "v4.0-project"),
	v4_0_build(com.github.openshift.circe.gen.def.v4_0.BuildUnit.class, "build", "v4.0-build"),
	v4_0_auth(com.github.openshift.circe.gen.def.v4_0.AuthUnit.class, "auth", "v4.0-auth"),
	v4_0_machineconfig(com.github.openshift.circe.gen.def.v4_0.MachineConfigrationUnit.class, "machineconfig", "v4.0-machineconfig"),
	v4_0_kubecontrolplane(com.github.openshift.circe.gen.def.v4_0.KubeControlPlaneUnit.class, "kubecontrolplane", "v4.0-kubecontrolplane"),
	v4_0_openshiftcontrolplane(com.github.openshift.circe.gen.def.v4_0.OpenShiftControlPlaneUnit.class, "openshiftcontrolplane", "v4.0-openshiftcontrolplane"),
	v4_0_console(com.github.openshift.circe.gen.def.v4_0.ConsoleUnit.class, "console", "v4.0-console"),
	;

	public Class<?> mustImplementClass;

	public String unitName;

	public String humanName;

	DefinitionType(Class<?> mustImplementClass, String unitName, String humanName) { this.mustImplementClass = mustImplementClass; this.unitName = unitName; this.humanName = humanName; }

}
