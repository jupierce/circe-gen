package com.redhat.openshift.cr.config.core;

import com.redhat.openshift.circe.beans.ObjectMeta;
import com.redhat.openshift.circe.gen.template.Parameter;
import com.redhat.openshift.circe.gen.template.Template;
import com.redhat.openshift.circe.yaml.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class SimpleTemplate implements Template {

    private final String message;
    private final List<Parameter> parameters;
    private final List<Bean> objects;
    private final Map<String,String> objectLabels;

    public SimpleTemplate(String message, List<Parameter> parameters, Map<String,String> objectLabels) {
        this.message = message;
        this.parameters = parameters;
        this.objectLabels = objectLabels;
        this.objects = new ArrayList<>();
    }

    public abstract ObjectMeta getMetadata();

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public List<Parameter> getParameters() {
        return this.parameters;
    }

    @Override
    public List<Bean> getObjects() {
        return objects;
    }

    @Override
    public Map<String, String> getObjectLabels() {
        return objectLabels;
    }

    public void addObject(BaseObject o) {
        this.objects.add(o);
    }


}
