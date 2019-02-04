package com.github.openshift.circe.beans;

import com.github.openshift.circe.yaml.Bean;
import com.github.openshift.circe.yaml.YamlPropertyIgnore;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import static java.lang.Thread.currentThread;

/**
 * A list of Beans will be rendered into a Kubernetes list object.
 * Each bean is registered with an 'id'. This identifier is never
 * rendered. It is intended to allow runtime access & overriding of
 * fields by subclasses.
 */
public class BeanList<T extends Bean> extends BaseObject {

    private final LinkedHashMap<String,T> backing;
    private final String listName;

    public BeanList() {
        super("v1", "List", null);
        backing = new LinkedHashMap<>();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        StackTraceElement caller = elements[1];
        this.listName = "[list created by " + caller.getClassName() + "." + caller.getMethodName() + " line " + caller.getFileName() + ":" + caller.getLineNumber() + "]";
    }

    // Strict add to the list. If the identifier already exists, an exception will be thrown.
    public void add(String identifier, T b) {
        T out = backing.put(identifier, b);
        if ( out != null ) {
            throw new UnsupportedOperationException("The identifier " + identifier + " already existed in the " + this.getClass().getName() + " " + listName + ". You may want to use set or replace." );
        }
    }

    // Strict replacement in the list. If the identifier does not already exist in the list, an exception will be thrown.
    public void replace(String identifier, T b) {
        T out = backing.put(identifier, b);
        if ( out == null ) {
            throw new UnsupportedOperationException("The identifier " + identifier + " did not exist prior to the replace operation in " + this.getClass().getName() + " " + listName + ". You may want to use add/set." );
        }
    }

    // Adds or replaces an element in the list. Does not check whether the identifier already exists.
    public void set(String identifier, T b) {
        backing.put(identifier, b);
    }

    // Returns the bean associated with the specified identifier. Returns null if not present.
    @YamlPropertyIgnore
    public T get(String identifier) {
        return backing.get(identifier);
    }

    // Strict removal of a bean. If the identifier is not present, an exception is thrown.
    public void remove(String identifier) {
        T out = backing.remove(identifier);
        if ( out == null ) {
            throw new UnsupportedOperationException("The identifier " + identifier + " was not found in the list " + listName + "." );
        }
    }

    public Collection<T> getItems() {
        return backing.values();
    }

}
