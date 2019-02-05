package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;

public abstract class BaseObject implements Bean {

    private final String apiVersion, kind;
    private final ObjectMeta metadata;

    public BaseObject(String apiVersion, String kind, ObjectMeta metadata) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

}
