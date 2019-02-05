package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;

import java.util.List;

public class KubeList<T extends Bean> extends BaseObject {

    private final List<T> list;

    public KubeList(List<T>  list) {
        super("v1", "List", null);
        this.list = list;
    }

    public List<T> getItems() {
        return list;
    }

}
