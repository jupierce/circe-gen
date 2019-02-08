package com.github.openshift.circe.yaml;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Extend this class and implement normal bean getter methods
 * to represent a map which can be augmented using inheritance.
 * You can enforce order using @RenderOrder
 * and change property names using @YamlPropertyName.
 * @param <T>
 */
public class MapBean<T> implements Map<String, T> {

    private Map<String, T> map = null;

    private synchronized Map<String, T> _map() {
        if ( map == null ) {
            map = new LinkedHashMap<String, T>();
            BeanAnalyzer analyzer = new BeanAnalyzer(this);
            analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
                @Override
                public void onMethod(Method m, String key, Object result) {
                    map.put(key, (T)result);
                }
            }, false);
            map = Collections.unmodifiableMap(map);
        }
        return map;
    }

    @YamlPropertyIgnore
    @Override
    public int size() {
        return _map().size();
    }

    @YamlPropertyIgnore
    @Override
    public boolean isEmpty() {
        return _map().isEmpty();
    }

    @YamlPropertyIgnore
    @Override
    public boolean containsKey(Object o) {
        return _map().containsKey(o);
    }

    @YamlPropertyIgnore
    @Override
    public boolean containsValue(Object o) {
        return _map().containsValue(o);
    }

    @YamlPropertyIgnore
    @Override
    public T get(Object o) {
        return _map().get(o);
    }

    @YamlPropertyIgnore
    @Override
    public T put(String s, T t) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public T remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public void putAll(Map<? extends String, ? extends T> map) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public Set<String> keySet() {
        return _map().keySet();
    }

    @YamlPropertyIgnore
    @Override
    public Collection<T> values() {
        return _map().values();
    }

    @YamlPropertyIgnore
    @Override
    public Set<Entry<String, T>> entrySet() {
        return _map().entrySet();
    }

}
