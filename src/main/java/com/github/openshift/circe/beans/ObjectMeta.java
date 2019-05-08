package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.YamlPropertyIgnore;
import com.github.openshift.circe.yaml.YamlPropertyName;

import java.util.HashMap;
import java.util.Map;

public class ObjectMeta {

    // These labels and values MUST match applier.py


    /**
     * This label can used by circe to instruct the applier to not actually apply
     * a rendered resource. This is useful in the case of certificates which are probably
     * not going to be re-rendered on each run. Marking in this manner prevents
     * the applier from incorrectly detecting the certificate on the cluster as an orphan.
     */
    public enum ApplierMarker {
        // Prevents applier from applying this rendering with extra queue to human that secret data is fake.
        FAKE_DATA("fake_data"),

        // Prevents applier from applying this rendering
        DO_NOT_APPLY("do_not_apply"),

        // The default behavior -- does not need to be set.
        STANDARD_DATA("standard_data");

        public static final String LABEL_NAME = "cr.applier/marker";
        private String value;

        ApplierMarker(String value) {
            this.value = value;
        }

        public String getLabelValue() {
            return value;
        }
    }

    /**
     * This label can used by circe to instruct the applier to delete a resource before
     * applying an update. This may be useful if, for example, a bug in an operator
     * is preventing it from reacting to a normal apply. Other modes may be
     * possible in the future (e.g. replace).
     */
    public enum ApplierMode {
        // Delete the resource before applying
        DELETE("delete"),

        // Follow normal behavior
        DEFAULT("default");

        public static final String LABEL_NAME = "cr.applier/mode";
        private String value;

        ApplierMode(String value) {
            this.value = value;
        }

        public String getLabelValue() {
            return value;
        }

    }

    /**
     * This label can used by circe to instruct the applier how to handle
     * a resource when it is detected as an orphan. The default behavior is
     * to warn so that a human can make a decision about whether a resource
     * is safe to remove.
     * There may be other times (e.g. on resources which we expect to come and
     * go) where automatic deletion is safe/desirable.
     */
    public enum ApplierWhenOrphaned {
        // The default behavior
        WARN("warn"),

        // Delete the orphans without warning
        DELETE("delete"),

        // Take no action (and do not warn) when this orphan is detected
        IGNORE("ignore");

        public static final String LABEL_NAME = "cr.applier/when-orphaned";
        private String value;

        ApplierWhenOrphaned(String value) {
            this.value = value;
        }

        public String getLabelValue() {
            return value;
        }

    }


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

    @YamlPropertyName("annotations")
    public Map<String,String> getAnnotations() {
        if ( annotations.size() == 0 ) {
            return null;
        }
        return annotations;
    }

    @YamlPropertyIgnore
    public void addLabel(String key, String value) {
        this.labels.put(key, value);
    }

    @YamlPropertyName("labels")
    public Map<String,String> getLabels() {
        if ( labels.size() == 0 ) {
            return null;
        }
        return labels;
    }


    /**
     * Set a flag that tells applier to handle this resource differently. This is useful
     * to overcome bugs where operators do not correctly detect oc apply.
     * https://bugzilla.redhat.com/show_bug.cgi?id=1701410
     */
    @YamlPropertyIgnore
    public void setApplierMode(ApplierMode mode) {
        addLabel(ApplierMode.LABEL_NAME, mode.getLabelValue());
    }


    /**
     * A marker is a signal to the applier that the rendered resource is somehow different
     * than standard data. This is useful to avoid the detection of orphans.
     *
     * It is sometimes necessary to render resources,
     * but have the applier skip actually applying them. Consider the scenario of certificate
     * secrets: you cannot generate them every time the Render runs or you will hit rate limits.
     * However, if you return null for the associated secrets, the applier will detect the
     * existing cert secrets as orphans.
     *
     * Instead, secrets can be generated with fake data, and the resource can be marked as fake data. This
     * will apply a label known by the applier which indicates the object is under management
     * but should not be applied on this run.
     *
     */
    @YamlPropertyIgnore
    public void setApplierMarker(ApplierMarker marker) {
        addLabel(ApplierMarker.LABEL_NAME, marker.getLabelValue());
    }

    /**
     * Instruct the applier how to handle when the resource is orphaned. By default,
     * a warning is raised, but you can also request that the resource be deleted
     * or ignored.
     * @param whenOrphaned
     */
    @YamlPropertyIgnore
    public void setApplierWhenOrphaned(ApplierWhenOrphaned whenOrphaned) {
        addLabel(ApplierWhenOrphaned.LABEL_NAME, whenOrphaned.getLabelValue());
    }

    /**
     * @return Returns whether this data is faked (and should not be applied)
     */
    @YamlPropertyIgnore
    public boolean isFakeData() {
        return ApplierMarker.FAKE_DATA.getLabelValue().equals(labels.get(ApplierMarker.LABEL_NAME));
    }

}
