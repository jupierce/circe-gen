package com.redhat.openshift.cr.config.impl.project;

import com.redhat.openshift.circe.gen.template.Parameter;

public class SimpleParameter implements Parameter {

    private final String name;

    public SimpleParameter(String name ) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }

    @Override
    public String getGenerate() {
        return null;
    }

    @Override
    public String getFrom() {
        return null;
    }

    @Override
    public Boolean getRequired() {
        return null;
    }
}
