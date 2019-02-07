package com.github.openshift.circe.beans;

import java.util.HashMap;
import java.util.Map;

public class ObjectMeta {

    private final String name, namespace;
    private final Map<String, String> annotations = new HashMap<>();
    private final Map<String, String> labels = new HashMap<>();

    public ObjectMeta(String namespace, String name, Map<String,String> labels, Map<String,String> annotations) {
        this.name = name;
        this.namespace = namespace;

        if ( labels != null ) {
            this.labels.putAll(labels);
        }

        if ( annotations != null ) {
            this.annotations.putAll(annotations);
        }

    }

    public ObjectMeta(String namespace, String name, Map<String,String> labels) {
        this(namespace, name, labels, null);
    }

    public ObjectMeta(String namespace, String name) {
        this(namespace, name, null, null);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getName() {
        return this.name;
    }

    public void addAnnotation(String key, String value) {
        this.annotations.put(key, value);
    }

    public Map<String,String> getAnnotations() {
        if ( annotations.size() == 0 ) {
            return null;
        }
        return annotations;
    }

    public void addLabel(String key, String value) {
        this.labels.put(key, value);
    }

    public Map<String,String> getLabels() {
        if ( labels.size() == 0 ) {
            return null;
        }
        return labels;
    }

}
