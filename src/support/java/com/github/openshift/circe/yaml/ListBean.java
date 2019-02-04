package com.github.openshift.circe.yaml;

/**
 * A ListBean is an object which will be serialized into
 * a YAML list. Each 'get' method must return a serializable
 * object. The *name* of the get method (e.g. getXYZ) does
 * not reflect at all in the resulting object (except possibly
 * in generated comments).
 *
 * The purpose of a ListBean is to make it easy to define a list
 * with the power of class hierarchy / inheritance at your disposal.
 */
public interface ListBean<T> extends Bean {
}
