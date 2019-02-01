package com.github.openshift.circe.yaml;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Apply to a bean method at it will result in the literal 'null'
 * being set in the serialized YAML file. The actual method will
 * not be invoked.
 * To implement a method annotated with this value, just
 * throw a UnsupportedOperationException. It should never
 * be thrown since the method will not be called.
 */
@Documented
@Retention(RUNTIME)
@Target({METHOD})
public @interface YamlLiteralNullValue {
}
