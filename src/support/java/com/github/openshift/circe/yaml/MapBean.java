package com.github.openshift.circe.yaml;

/**
 * A MapBean is an object which will be serialized into
 * a YAML map. Each 'get' method must return a serializable
 * object. The get*name* of the get method (e.g. getXYZ) will become
 * a key in the map.
 *
 * The purpose of a MapBean is to make it easy to define a list
 * with the power of class hierarchy / inheritance at your disposal.
 *
 * Use @RenderOrder to control the order of the output.
 * Use @YamlPropertyName to override the default lowerCamelCasing algorithm.
 */
public interface MapBean<T> extends Bean {
}
