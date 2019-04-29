// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen;


public enum UnitType {

	v4_0_project(com.github.openshift.circe.gen.units.v4_0.ProjectUnit.class, "project", "v4.0-project"),
	v4_0_build(com.github.openshift.circe.gen.units.v4_0.BuildUnit.class, "build", "v4.0-build"),
	v4_0_auth(com.github.openshift.circe.gen.units.v4_0.AuthUnit.class, "auth", "v4.0-auth"),
	v4_0_machineconfig(com.github.openshift.circe.gen.units.v4_0.MachineConfigrationUnit.class, "machineconfig", "v4.0-machineconfig"),
	v4_0_openshiftingress(com.github.openshift.circe.gen.units.v4_0.OpenShiftIngressUnit.class, "openshiftingress", "v4.0-openshiftingress"),
	v4_0_controlplane(com.github.openshift.circe.gen.units.v4_0.ControlPlaneUnit.class, "controlplane", "v4.0-controlplane"),
	v4_0_kubecontrolplane(com.github.openshift.circe.gen.units.v4_0.KubeControlPlaneUnit.class, "kubecontrolplane", "v4.0-kubecontrolplane"),
	v4_0_openshiftcontrolplane(com.github.openshift.circe.gen.units.v4_0.OpenShiftControlPlaneUnit.class, "openshiftcontrolplane", "v4.0-openshiftcontrolplane"),
	v4_0_console(com.github.openshift.circe.gen.units.v4_0.ConsoleUnit.class, "console", "v4.0-console"),
	v4_0_monitoring(com.github.openshift.circe.gen.units.v4_0.MonitoringUnit.class, "monitoring", "v4.0-monitoring"),
	;

	public Class<?> mustImplementClass;

	public String unitName;

	public String humanName;

	UnitType(Class<?> mustImplementClass, String unitName, String humanName) { this.mustImplementClass = mustImplementClass; this.unitName = unitName; this.humanName = humanName; }

}
