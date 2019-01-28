package com.redhat.openshift.circe.gen.project;

public class ObjectMeta {
	private final String name, namespace;
	public ObjectMeta(String namespace, String name) { this.name = name; this.namespace = namespace; }
	public String getNamespace() { return this.namespace; }
	public String getName() { return this.name; }
}
