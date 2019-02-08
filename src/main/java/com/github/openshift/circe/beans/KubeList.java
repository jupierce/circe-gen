package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;
import com.github.openshift.circe.yaml.YamlPropertyIgnore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KubeList<T extends Bean> extends BaseObject {

    private final List<T> list = new ArrayList<T>();

    public KubeList() {
        super("v1", "List", null);
    }

    public KubeList(Collection<? extends T>  list) {
        this();
        if ( list != null ) {
            this.list.addAll(list);
        }
    }

    @YamlPropertyIgnore
    public void add(T item) {
        this.list.add(item);
    }

    @YamlPropertyIgnore
    public void addAll(Collection<? extends T> item) {
        this.list.addAll(item);
    }

    public List<T> getItems() {
        if ( list.size() == 0 ) {
            return null;
        }
        return list;
    }

}
