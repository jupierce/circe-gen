package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.YamlPropertyIgnore;

import java.util.HashMap;
import java.util.Map;

public class ObjectMeta {

    // These values MUST match applier.py
    private final String LABEL_NAME_APPLIER_MARKER = "cr.applier/marker";
    private final String MARKER_VALUE_FAKEDATA = "fake_data";
    private final String MARKER_VALUE_DO_NOT_APPLY = "do_not_apply";

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

    /**
     * To avoid the detection of orphans, it is sometimes necessary to render resources,
     * but have the applier skip actually applying them. Consider the scenario of certificate
     * secrets: you cannot generate them ever time the Render runs or you will hit rate limits.
     * However, if you return null for the associated secrets, the applier will detect the
     * existing cert secrets as orphans.
     *
     * Instead, secrets can be generated with fake data, and this method can be invoked. It
     * will apply a label known by the applier which indicates the object is under management
     * but should not be applied on this run.
     *
     */
    @YamlPropertyIgnore
    public void markDoNotApply() {
        addLabel(LABEL_NAME_APPLIER_MARKER, MARKER_VALUE_DO_NOT_APPLY);
    }

    /**
     * Setting this label on secrets implies to the rendering engine that the secret
     * within the is fake and it is safe to persist the secret to disk.
     */
    @YamlPropertyIgnore
    public void markFakeData() {
        addLabel(LABEL_NAME_APPLIER_MARKER, MARKER_VALUE_FAKEDATA);
    }

    @YamlPropertyIgnore
    public boolean isFakeData() {
        return MARKER_VALUE_FAKEDATA.equals(labels.get(LABEL_NAME_APPLIER_MARKER));
    }

    @YamlPropertyIgnore
    public boolean isDoNotApply() {
        return MARKER_VALUE_DO_NOT_APPLY.equals(labels.get(LABEL_NAME_APPLIER_MARKER));
    }

}
