package com.github.openshift.circe.yaml;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Extend this class and implement normal bean getter methods
 * to represent a list which can be augmented using inheritance.
 * You can enforce order using @RenderOrder
 * and change property names using @YamlPropertyName.
 * @param <T>
 */
public class ListBean<T> implements List<T> {

    private List<T> list = null;

    private synchronized List<T> _list() {
        if ( list == null ) {
            list = new ArrayList<T>();
            BeanAnalyzer analyzer = new BeanAnalyzer(this);
            analyzer.forEachMethod(new BeanAnalyzer.BeanMethodHandler() {
                @Override
                public void onMethod(Method m, String key, Object result) {
                    list.add((T)result);
                }
            }, false);
            list = Collections.unmodifiableList(list);
        }
        return list;
    }

    @YamlPropertyIgnore
    @Override
    public int size() {
        return _list().size();
    }

    @YamlPropertyIgnore
    @Override
    public boolean isEmpty() {
        return _list().isEmpty();
    }

    @YamlPropertyIgnore
    @Override
    public boolean contains(Object o) {
        return _list().contains(o);
    }

    @YamlPropertyIgnore
    @Override
    public Iterator<T> iterator() {
        return _list().iterator();
    }

    @YamlPropertyIgnore
    @Override
    public Object[] toArray() {
        return _list().toArray();
    }

    @YamlPropertyIgnore
    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return _list().toArray(t1s);
    }

    @YamlPropertyIgnore
    @Override
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public boolean containsAll(Collection<?> collection) {
        return _list().containsAll(collection);
    }

    @YamlPropertyIgnore
    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @YamlPropertyIgnore
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public T get(int i) {
        return _list().get(i);
    }

    @YamlPropertyIgnore
    @Override
    public T set(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public void add(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public T remove(int i) {
        throw new UnsupportedOperationException();
    }

    @YamlPropertyIgnore
    @Override
    public int indexOf(Object o) {
        return _list().indexOf(o);
    }

    @YamlPropertyIgnore
    @Override
    public int lastIndexOf(Object o) {
        return _list().lastIndexOf(o);
    }

    @YamlPropertyIgnore
    @Override
    public ListIterator<T> listIterator() {
        return _list().listIterator();
    }

    @YamlPropertyIgnore
    @Override
    public ListIterator<T> listIterator(int i) {
        return _list().listIterator(i);
    }

    @YamlPropertyIgnore
    @Override
    public List<T> subList(int i, int i1) {
        return _list().subList(i, i1);
    }

}
