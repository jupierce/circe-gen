package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;
import com.github.openshift.circe.yaml.ListBean;

/**
 * A list of Beans will be rendered into a Kubernetes list object.
 * Each bean is registered with an 'id'. This identifier is never
 * rendered. It is intended to allow runtime access & overriding of
 * fields by subclasses.
 */
public abstract class KubeList<T extends Bean> extends BaseObject {

    public KubeList() {
        super("v1", "List", null);
    }

    public abstract ListBean<T> getItems();

}
